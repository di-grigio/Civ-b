package engine;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.JFrame;
import recources.Recources;
import render.Render;
import script.Scripts;
import main.Config;
import misc.ToolsConst;
import misc.Tools;

public class Engine {
	
	public static JFrame frame;

	public Engine() throws IOException{
		initFrame();
		initEngine();
	}
	
	private void initFrame(){
		frame = new JFrame();
		frame.setTitle(ToolsConst.title + " v" + ToolsConst.version + "." + ToolsConst.subVersion 
				+ " mode: " + Config.renderMode);
		
		Dimension dimension = new Dimension(Config.frameWidth, Config.frameHeight);
		frame.setSize(dimension);
		frame.setMinimumSize(dimension);
		
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void initEngine() throws IOException{
		new Tools();
		new Scripts();
		new Recources(Config.renderMode);
		
		new Thread(new Render(Config.renderMode, frame)).start();
	}
}
