// longest prefix suffix
const getLPSTable = (pattern) => {
  const lps = new Array(pattern.length).fill(0);
  let i = 0,
    j = 1;

  while (j < pattern.length) {
    if (pattern.charAt(i) === pattern.charAt(j)) {
      lps[j] = i + 1;
      i++;
      j++;
    } else {
      if (i === 0) {
        lps[j] = 0;
        j++;
      } else {
        i = lps[i - 1];
      }
    }
  }
  return lps;
};

/**
 * KMP (Knuth Morris Pratt) Pattern Searching
 * @param {String} text
 * @param {String} pattern
 * @return {Number} matchedIndex
 */
const kmp = (text, pattern) => {
  const lps = getLPSTable(pattern);

  let textIndex = 0,
    patternIndex = 0;

  while (textIndex < text.length) {
    if (text.charAt(textIndex) === pattern.charAt(patternIndex)) {
      textIndex++;
      patternIndex++;
      if (patternIndex === pattern.length) {
        //Found pattern in text
        return textIndex - pattern.length;
      }
    } else if (patternIndex === 0) {
      textIndex++;
    } else {
      //Continue with unmatched part, dont repeat matched part
      patternIndex = lps[patternIndex - 1];
    }
  }
  //Not found pattern in text
  return -1;
};

// Example
// const matchIndex = kmp(text, pattern);
module.exports = kmp;
