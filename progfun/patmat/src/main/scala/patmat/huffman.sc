import patmat._

Huffman.decodedSecret

val text = "Hello, world!"
val ct = Huffman.createCodeTree(text.toList)

val cipher = Huffman.encode(ct)(text.toList)
Huffman.decode(ct, cipher)

val cipher2 = Huffman.quickEncode(ct)(text.toList)
Huffman.decode(ct, cipher2)

Huffman.convert(ct)