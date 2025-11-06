package common

import java.nio.file.Files
import java.nio.file.Paths
import java.util.concurrent.TimeUnit
import kotlin.io.path.absolutePathString

fun saveBitMap(bitmap: String, filePath: String) {
    val tempFilePath = Paths.get(filePath + "-temp.txt")
    Files.write(tempFilePath, bitmap.toByteArray())
    val proc = ProcessBuilder("pnmtopng", tempFilePath.absolutePathString())
        .redirectOutput(Paths.get(filePath).toFile())
        .start()
    proc.waitFor(60, TimeUnit.SECONDS)
    Files.delete(tempFilePath)
}