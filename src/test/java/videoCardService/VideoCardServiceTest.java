package videoCardService;

import com.promosite.promosite.model.VideoCard;
import com.promosite.promosite.repository.VideoCardRepository;
import com.promosite.promosite.service.VideoCardService;
import com.promosite.promosite.service.VideoCardServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VideoCardServiceTest {

    @Mock
    private VideoCardRepository videoCardRepository;

    @InjectMocks
    private VideoCardServiceImpl VideoCardServiceImpl;

    @ParameterizedTest
    @NullSource
    public void findAllNullPointerException(List<VideoCard> videoCards) {
        assertThrows(NullPointerException.class, () -> {
            when(videoCardRepository.findAll()).thenThrow(NullPointerException.class);
            List<VideoCard> all = VideoCardServiceImpl.findAll();
        });
    }

    @ParameterizedTest
    @MethodSource("emptyListOfUsers")
    public void findAllIsEmpty(List<VideoCard> videoCards) {
        when(videoCardRepository.findAll()).thenReturn(videoCards);
        List<VideoCard> all = VideoCardServiceImpl.findAll();
        assertEquals(all.size(), 0);

    }

    @ParameterizedTest
    @MethodSource("listOfUsers")
    void findAll(List<VideoCard> videoCards) {
        when(videoCardRepository.findAll()).thenReturn(videoCards);

        List<VideoCard> all = VideoCardServiceImpl.findAll();
        assertTrue(all.size() == videoCards.size() && all.containsAll(videoCards) && videoCards.containsAll(all));

    }

    static Stream<Arguments> emptyListOfUsers() {
        return Stream.of(arguments(Collections.emptyList()));
    }

    static Stream<Arguments> listOfUsers() {
        return Stream.of(arguments(Arrays.asList(
                VideoCard.builder().videoChipset("видюха_1"),
                VideoCard.builder().videoChipset("видюха_2"),
                VideoCard.builder().videoChipset("видюха_3"))));
    }


}