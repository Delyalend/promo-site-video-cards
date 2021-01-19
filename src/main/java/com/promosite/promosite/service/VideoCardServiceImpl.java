package com.promosite.promosite.service;

import com.promosite.promosite.model.VideoCard;
import com.promosite.promosite.repository.VideoCardRepository;
import com.promosite.promosite.repository.VideoCardRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VideoCardServiceImpl implements VideoCardService {

    private VideoCardRepository videoCardRepo;

    public VideoCardServiceImpl(VideoCardRepository videoCardRepo) {
        this.videoCardRepo = videoCardRepo;
    }

    @Override
    public List<VideoCard> findAll() {
        return videoCardRepo.findAll();
    }

    @Override
    @Transactional
    public void create(VideoCard videoCard) {
        videoCardRepo.create(videoCard);
    }
}
