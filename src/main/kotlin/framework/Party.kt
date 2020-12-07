package framework

/**
 * Represents a party of six Pokemon
 */
interface Party {
    val pokemon: Map<PartySlot, Pokemon?>
    val isFull: Boolean

    /**
     * Adds a [pokemon] to the party.
     * @throws IllegalStateException If the party is full
     */
    fun addPokemon(pokemon: Pokemon)

    /**
     * Removes the pokemon in a given [slot] from the party
     * @throws IllegalStateException If the slot is empty
     */
    fun removePokemon(slot: PartySlot)

    /**
     * Swaps the Pokemon at [slot1] and [slot2]
     */
    fun swap(slot1: PartySlot, slot2: PartySlot)
}

/**
 * The six slots for Pokemon in a party
 */
enum class PartySlot {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}
