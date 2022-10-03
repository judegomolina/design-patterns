package factoryMethod.factories

import factoryMethod.meal.breakfast.StandardBreakfast
import factoryMethod.meal.breakfast.VeganBreakfast

object BreakfastFactory {
    fun getBreakfast(id: Long, name: String,type: String) = when (type.trim().lowercase()) {
            "standard" -> StandardBreakfast(id, name)
            "vegan" -> VeganBreakfast(id, name)
            else -> throw RuntimeException("Unknown breakfast type: $type")
        }
}
