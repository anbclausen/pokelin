package standard

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import ktx.app.KtxApplicationAdapter
import ktx.app.clearScreen


fun main() {
    GameImpl().start()
}

class GameImpl {
    fun start() {
        val config = LwjglApplicationConfiguration().apply {
            title = "PokéLin"
            width = 1280
            height = 720
        }

        LwjglApplication(MyGame(), config)
    }
}

class MyGame : KtxApplicationAdapter {
    private lateinit var img : Texture
    private lateinit var batch : Batch

    private var imgWidth : Float    = 0f
    private var imgHeight : Float   = 0f

    override fun create() {
        img = Texture("assets/logo.png")
        batch = SpriteBatch()

        imgWidth = Gdx.graphics.width / 2f - img.width / 2f
        imgHeight = Gdx.graphics.height / 2f - img.height / 2f
    }

    override fun render() {
        clearScreen(0f, 0f, 0f, 0f)

        handleInput()
        logic()
        draw()
    }

    override fun dispose() {
        super.dispose()
        batch.dispose()
        img.dispose()
    }

    private fun handleInput() { }

    private fun logic() { }

    private fun draw() {
        batch.begin()
        batch.draw(img, imgWidth, imgHeight)
        batch.end()
    }
}