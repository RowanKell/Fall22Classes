public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
            int charMax = 0;
            int charMaxIndex = -999;
            int charMaxSize = 0;
            for(int i = 0; i < strands.length; i++) {
                  int charCount = 0;
                  for(int j = 0; j < strands[i].length(); j++) {
                        if(strands[i].substring(j, j+1).equals(nuc)) {
                              charCount += 1;
                        }
                  }
                  if(charCount == 0) {
                        continue;
                  }
                  else if(charCount > charMax) {
                        charMax = charCount;
                        charMaxIndex = i;
                        charMaxSize = strands[i].length();
                  }
                  else if(charCount == charMax) {
                        if(strands[i].length() > charMaxSize) {
                              charMaxIndex = i;
                              charMaxSize = strands[i].length();
                        }
                        else {
                              continue;
                        }
                  }
                  else {
                        continue;
                  }
            }
            if(charMaxIndex == -999) {
                  return "";
            }
            else {
                  return strands[charMaxIndex];
            }
      }
}    
