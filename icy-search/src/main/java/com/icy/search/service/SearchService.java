package com.icy.search.service;

import org.apache.solr.client.solrj.SolrServerException;

import com.icy.search.pojo.SearchResult;

public interface SearchService {
	
	SearchResult search (String queryString ,int page , int rows) throws SolrServerException;

}
