package com.promosite.promosite.service;

import com.promosite.promosite.model.VideoCard;
import com.promosite.promosite.repository.VideoCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VideoCardServiceImpl implements VideoCardService {

    @Autowired
    private VideoCardRepository videoCardRepo;

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
