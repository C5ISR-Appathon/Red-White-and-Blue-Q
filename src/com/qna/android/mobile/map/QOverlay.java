package com.qna.android.mobile.map;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class QOverlay extends ItemizedOverlay<OverlayItem>{

	private ArrayList<OverlayItem> items;
	
	public QOverlay(Drawable icon) {
		super(boundCenterBottom(icon));
		items = new ArrayList<OverlayItem>();
		populate();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected OverlayItem createItem(int i) {
		 return (OverlayItem) items.get(i);
	
	}
	
	protected void addNewItem(GeoPoint Location, String markerText, String snippet){
		items.add(new OverlayItem(Location, markerText,snippet));
		populate();
	}
	
	protected void remoteItem(int index){
		items.remove(index);
		populate();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return items.size();
	}
	
	
}
