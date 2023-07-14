


fun isPalindrome(x: Int): Boolean {
    var revx = x.toString()
    revx = revx.reversed()
    if(revx == x.toString()){return true}
    return false

}