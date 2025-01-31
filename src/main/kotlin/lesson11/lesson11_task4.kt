package org.example.lesson11

class Caterories(
    private var coverURL: String,
    private var title: String,
    private var description: String,
    var recipes: MutableList<Recipe> = mutableListOf(),
) {
    fun changeCover(newImage: String) {
        coverURL = newImage
    }

    fun changeTitle(newTitleText: String) {
        title = newTitleText
    }

    fun changeDescription(newDescText: String) {
        description = newDescText
    }
}

class Recipe(
    val id: Int,
    private var title: String,
    private var coverURL: String,
    private var description: String,
    val caloricContent: Int,
    val ingredients: MutableList<Ingredients> = mutableListOf(),
    var cookingProcess:String,
    var isInFavorite: Boolean = false,
) {
    fun changeTitle(newTitleText: String) {
        title = newTitleText
    }
    fun changeCover(newImageUrl:String){
        coverURL= newImageUrl
    }
    fun changeDescription(newDescText:String){
        description=newDescText
    }
    fun addInFavorite(){
        isInFavorite=true
    }
    fun removeFromFavorite(){
        isInFavorite=false
    }
    fun changeCookingProcess(newText:String){
        cookingProcess = newText
    }
    fun addIngredient(newIngredient:String){
ingredients
    }
}

class Ingredients(
    val nameAndVolue:MutableMap<String,Int> = mutableMapOf(),
    val numberOfServings:Int
) {

}