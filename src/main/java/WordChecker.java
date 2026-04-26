public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> wordlist) {
    this.wordList = wordList;
  }

  public boolean isWordChain() {
    String x = null;
    for(String word : wordList) {
      if(x == null) {
        x = word;
        continue;
      }

      if(!word.contains(x)) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> ret = new ArrayList<>();
    for(String word : wordList) {
      if(word.startsWith(target)) {
        ret.add(word.substring(target.length()));
      }
    }

    return ret;
  }
}
