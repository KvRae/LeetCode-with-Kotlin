import java.util.*


fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    for (c in s) {
        when (c) {
            '(' -> stack.push(')')
            '[' -> stack.push(']')
            '{' -> stack.push('}')
            else -> {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false
                }
            }
        }
    }
    return stack.isEmpty()
}
