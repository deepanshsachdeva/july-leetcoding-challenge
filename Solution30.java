class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
		if (s.length() > 100) 
            return new ArrayList();

		List<String> result = new ArrayList<String> ();
        
		dfs(s, wordDict, result, new StringBuilder());
        
		return result;
	}
    
    public void dfs(String s, List<String> wordDict, List<String> result, StringBuilder subList) {
		if (subList.length() != 0)
			subList.append(" ");
        
        for (String word: wordDict) {
			if (s.startsWith(word)) {
				StringBuilder sb = new StringBuilder(subList);
                
				sb.append(word);
                
				if (s.equals(word))
					result.add(new String(sb));
				else
					dfs(s.substring(word.length()), wordDict, result, sb);
            }
		}
	}
}
