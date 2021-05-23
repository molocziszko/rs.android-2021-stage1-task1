package subtask1

import java.util.ArrayList

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val newList = sadArray.toCollection(ArrayList())
        var left = 1
        var right = newList.size - 1

        while (left < right) {
            if (newList[left - 1] + newList[left + 1] < newList[left]) {
                newList.removeAt(left)
                right--
                
                if (left > 1) {
                    left--
                }
            } else {
                left++
            }
        }
        return newList.toIntArray()
    }
}
