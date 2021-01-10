package com.promosite.promosite.repository;

import com.promosite.promosite.model.VideoCard;

import java.util.List;

public interface VideoCardRepository{
    List<VideoCard> findAll();
    void create(VideoCard videoCard);
}
