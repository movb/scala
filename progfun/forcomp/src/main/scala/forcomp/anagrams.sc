import forcomp.Anagrams
import forcomp.Anagrams._

Anagrams.wordOccurrences("abcd")
Anagrams.combinations(List(('a', 2), ('b', 2)))
Anagrams.sentenceOccurrences(List("abcd", "e"))
Anagrams.dictionaryByOccurrences.get(List(('a', 1), ('e', 1), ('t', 1)))
val sentence = List("Linux", "rulez")
val sentence2 = List("Yes", "man")
val sentence3 = List("man")
Anagrams.sentenceAnagrams(sentence2)

Anagrams.combinations(List())
Anagrams.dictionaryByOccurrences(List())
subtract(List(), List())