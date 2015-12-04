package title;

import java.awt.Color;

import system.DrawLibrary;
import system.FontMgr;
import mvcModule.SceneChangeFacade;
import mvcModule.ViewerComponent;

public class TitleViewerComponent extends ViewerComponent{
	public TitleViewerComponent(SceneChangeFacade scfacade){
		super(scfacade);
	}
	
	public void draw(){
		DrawLibrary drawlib = DrawLibrary.getInstance();
		drawlib.drawString(200, 240, "�Ђ��肭������ł��ā[���P", Color.WHITE, FontMgr.getInstance().getFontToId(FontMgr.FontId.POPMENU), true);
		drawlib.drawString(200, 280, "�݂���������ł��ā[���Q", Color.WHITE, FontMgr.getInstance().getFontToId(FontMgr.FontId.POPMENU), true);
	}
}
