package com.promosite.promosite.repository;

import com.promosite.promosite.model.Role;
import com.promosite.promosite.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager em;

    @Override
    @Transactional
    public Optional<User> findUserByUsername(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> userRoot = cq.from(User.class);
        cq.select(userRoot).where(cb.equal(userRoot.get("username"), username));
        TypedQuery<User> query = em.createQuery(cq);

        List<User> resultList = query.getResultList();

        if (resultList.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(resultList.get(0));
        }
    }

    @Override
    public void save(User user) {
        user.setRoles(Collections.singleton(Role.USER));
        user.setActive(true);
        em.persist(user);

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaUpdate<User> criteriaUpdate = cb.createCriteriaUpdate(User.class);
//        Root<User> userRoot = criteriaUpdate.from(User.class);
//        criteriaUpdate.set(userRoot.get("username"),user.getUsername());
//        criteriaUpdate.set(userRoot.get("password"),user.getPassword());
//        criteriaUpdate.set(userRoot.get("active"),true);
//        criteriaUpdate.set(userRoot.get("roles"), Collections.singleton("USER"));

    }
}
