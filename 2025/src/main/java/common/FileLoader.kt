package common

class FileLoader {
    companion object {
        fun loadFile(path: String) = this::class.java.getResource("../$path")!!.readText().trimEnd()
    }
}