package userService;

import com.promosite.promosite.model.User;
import com.promosite.promosite.repository.UserRepository;
import com.promosite.promosite.service.UserService;
import com.promosite.promosite.service.UserServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceIml;



    @ParameterizedTest
    @CsvSource({"1,mike,12345,true,", "2,bob,12345,true,",
            "3,nick,12345,true,", "4,kane,12345,true,"})
    void findByUsername(@AggregateWith(UserAggregator.class) User user) throws Exception {
        when(userRepository.findUserByUsername(user.getUsername())).thenReturn(Optional.of(user));
        User found = userServiceIml.findByUsername(user.getUsername());
        assertThat(found.getUsername()).isEqualTo(user.getUsername());
    }


    static class UserAggregator implements ArgumentsAggregator {
        @Override
        public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context)
                throws ArgumentsAggregationException {
            return new User(accessor.getLong(0),
                    accessor.getString(1),
                    accessor.getString(2),
                    accessor.getBoolean(3),
                    accessor.get(4, HashSet.class));
        }
    }


}