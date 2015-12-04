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
		drawlib.drawString(200, 240, "Ç–ÇæÇËÇ≠ÇËÇ¡Ç≠Ç≈Ç∑ÇƒÅ[Ç∂ÇP", Color.WHITE, FontMgr.getInstance().getFontToId(FontMgr.FontId.POPMENU), true);
		drawlib.drawString(200, 280, "Ç›Ç¨Ç≠ÇËÇ¡Ç≠Ç≈Ç∑ÇƒÅ[Ç∂ÇQ", Color.WHITE, FontMgr.getInstance().getFontToId(FontMgr.FontId.POPMENU), true);
	}
}
