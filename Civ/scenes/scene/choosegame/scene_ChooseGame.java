package scene.choosegame;

import java.awt.Graphics;
import javax.media.opengl.GL2;
import com.jogamp.opengl.util.awt.TextRenderer;
import misc.Enums;
import scene.Scene;


public class scene_ChooseGame extends Scene {

	public scene_ChooseGame() {
		super(Enums.Scene.CHOOSE_GAME, new scenedata_ChooseGame());
	}

	@Override
	public void draw(Graphics g, long tic) {

	}

	@Override
	public void draw(GL2 gl, TextRenderer textrender) {

	}
}
