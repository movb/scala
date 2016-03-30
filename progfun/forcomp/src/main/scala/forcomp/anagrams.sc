import forcomp.Anagrams

Anagrams.wordOccurrences("abcd")
Anagrams.combinations(List(('a', 2), ('b', 2)))
Anagrams.sentenceOccurrences(List("abcd", "e"))
Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
val sentence = List("Linux", "rulez")
Anagrams.sentenceAnagrams(sentence)

for {combination <- Anagrams.combinations(Anagrams.sentenceOccurrences(sentence))
    word <- Anagrams.dictionaryByOccurrences(combination)
    if (word != Nil)
  }
  yield word