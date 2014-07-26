package com.example.cocos2ddemo;

import org.cocos2d.layers.CCColorLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGSize;
import org.cocos2d.types.ccColor4B;

import com.kal.myparallax.CCVerticalParallaxNode;

public class TestScene extends CCColorLayer {
	public static CCScene getScene() {
		CCScene scene = CCScene.node();
		scene.addChild(new TestScene(ccColor4B.ccc4(255, 0, 0, 255)));

		return scene;
	}

	private CCVerticalParallaxNode background;

	protected TestScene(ccColor4B color) {
		super(color);
		// TODO Auto-generated constructor stub

		CGSize winSize = CCDirector.sharedDirector().displaySize();
		float sX = winSize.width / 720.0f;
		float sY = winSize.height / 1200.0f;
		background = CCVerticalParallaxNode.node(sX, sY, true);

		background.addEntity(1f, "background.png", 0);
		background.addEntity(3, "road_simple.png", winSize.width / 2);
		background.addEntity(1.7f, "road_side.png", 0);
		addChild(background);

		this.schedule("update");
	}

	public void update(float t) {
		background.setParallaxValue(50 * t);

	}

}
