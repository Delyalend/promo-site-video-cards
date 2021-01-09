package com.promosite.promosite.repository;

import com.promosite.promosite.model.VideoCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Component
public class VideoCardRepositoryImpl implements VideoCardRepository {

    @Autowired
    private EntityManager em;


    @Override
    public List<VideoCard> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<VideoCard> cq = cb.createQuery(VideoCard.class);
        Root<VideoCard> userRoot = cq.from(VideoCard.class);
        cq.select(userRoot);
        TypedQuery<VideoCard> query = em.createQuery(cq);
        return query.getResultList();

    }
}
