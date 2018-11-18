package com.icy.portal.service;

import com.icy.portal.pojo.SearchResult;

public interface SearchService {
	
     public SearchResult getSearchResult(String query,int page);
}
