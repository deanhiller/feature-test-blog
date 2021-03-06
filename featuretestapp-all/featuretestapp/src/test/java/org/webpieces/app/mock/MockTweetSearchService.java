package org.webpieces.app.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.webpieces.app.example1.remoteclients.TweetSearchService;

public class MockTweetSearchService implements TweetSearchService {
  private List<Integer> tweetIds;

  public void setResponse(List<Integer> tweetIdsResponse) {
    tweetIds = tweetIdsResponse;
  }

  @Override
  public List<Integer> query(String queryString) {
    return tweetIds;
  }
}
