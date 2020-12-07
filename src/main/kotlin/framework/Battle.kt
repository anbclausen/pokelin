package framework

/**
 * This interface represents a battle. It should be used when the player enters a battle,
 * and should handle the interaction between pokemon's and how these battle
 */
interface Battle {
    val allyTrainer: Trainer
    val enemyTrainer: Trainer
    var turn: Boolean //TODO: I think boolean is a nice way to represent this but I am not 100% sure

    //TODO: Implement Pokemon class and move class
    /**
     * Uses a [move] on the opposing pokemon
     * TODO: I'm not sure this should be given an attacker or this can be calculated based on whose turn it is
     */
    fun useMove(attacker: Pokemon, move: Move)

    //TODO: Implement Item class
    /**
     * Uses an [item] on the [user]
     */
    fun useItem(user: Pokemon, item: Item)

    /**
     * Attempts to run away from the battle, this is not possible during trainer battles
     */
    fun runAway()

    /**
     * Changes the active pokemon for the [player] to a [newPokemon]
     */
    fun changePokemon(player: Trainer, newPokemon: Pokemon)
}