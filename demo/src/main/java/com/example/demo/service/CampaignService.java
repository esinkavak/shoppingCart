package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Campaign;
import com.example.demo.model.Category;

public interface CampaignService {

	public List<Campaign> getCampaigns(Category category);

}
