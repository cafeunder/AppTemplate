package game;

import java.awt.Color;

import system.DrawLibrary;
import system.FontMgr;
import mvcModule.SceneChangeFacade;
import mvcModule.ViewerComponent;

public class GameViewerComponent extends ViewerComponent {
	private GameModel gModel;
	public GameViewerComponent(SceneChangeFacade scfacade, GameModel gModel){
		super(scfacade);
		this.gModel = gModel;
	}
	
	public void draw(){
		this.gModel.draw();
	}
}
