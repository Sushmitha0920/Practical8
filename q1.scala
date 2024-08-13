object CaesarCipher {

    def encrypt(text: String, shift: Int):String = {
        text.map { char =>
            if(char.isLetter) {
                val base = if(char.isLower) 'a' else 'A'
                ((char - base + shift) % 26 + base).toChar
            }else{
                char
            }
        }
    }

    def decrypt(text: String, shift: Int):String = {
        text.map { char =>
            if(char.isLetter) {
                val base = if(char.isLower) 'a' else 'A'
                ((char - base - shift + 26) % 26 + base).toChar
            }else{
                char
            }
        }
    }

    def cipher(text: String, shift: Int, algo: (String, Int) => String): String = {
        algo(text, shift)
    }

    def main(args: Array[String]): Unit = {
        val text = "Hello World"
        val shift = 3

        val encryptedText = cipher(text, shift, encrypt)
        println(s"Encrypted: $encryptedText")

        val decryptedText = cipher(encryptedText, shift, decrypt)
        println(s"Decrypted: $decryptedText")

    }
}