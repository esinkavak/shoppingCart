package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.common.DiscountType;
import com.example.demo.model.Campaign;
import com.example.demo.model.Category;
import com.example.demo.service.CampaignService;

@Service
public class CampaignServiceImpl implements CampaignService {

	@Override
	public List<Campaign> getCampaigns(Category category) {
		List<Campaign> campaignList = new ArrayList<>();

		Campaign campaign1 = new Campaign(category, 20.0, 3, DiscountType.RATE);
		Campaign campaign2 = new Campaign(category, 50.0, 5, DiscountType.RATE);
		Campaign campaign3 = new Campaign(category, 5.0, 5, DiscountType.AMOUNT);

		campaignList.add(campaign1);
		campaignList.add(campaign2);
		campaignList.add(campaign3);

		return campaignList;
	}

}
