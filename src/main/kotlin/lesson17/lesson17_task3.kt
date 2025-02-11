package org.example.lesson17

class Folder(
    private val _name: String,
    private val _numberOfFiles: Int = 10,
    val isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret) "Hidden folder" else _name

    val numberOfFiles: Int
        get() = if (isSecret) 0 else _numberOfFiles
}

fun main() {
    val folder1 = Folder("Naked party", isSecret = false)

    println("Folder name: ${folder1.name}\n Number of files: ${folder1.numberOfFiles}")
}