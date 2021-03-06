package com.peak.mixen.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.peak.mixen.MetaTrack;
import com.peak.mixen.R;

import java.util.ArrayList;

public class SongQueueListAdapter extends ArrayAdapter<SongQueueListItem> {

	LayoutInflater inflater;
	public SongQueueListAdapter(Context context, ArrayList<SongQueueListItem> items) {
		super(context, 0, items);
		inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public static ArrayList<SongQueueListItem> convertToListItems(ArrayList<MetaTrack> metaTracks)
	{
		ArrayList<SongQueueListItem> listItems = new ArrayList<>(metaTracks.size());

		for(MetaTrack track : metaTracks)
		{
			listItems.add(new SongQueueListItem(track));
		}

		return listItems;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View v = convertView;
		SongQueueListItem listItem = getItem(position);

		if(convertView == null) {
			v = inflater.inflate(R.layout.song_list_item, null);
		}

		v.setBackground(getContext().getResources().getDrawable(R.drawable.song_queue_item_background));

		TextView songName = (TextView) v.findViewById(R.id.songName);
		TextView artistName = (TextView) v.findViewById(R.id.artistName);
		TextView addedBy = (TextView) v.findViewById(R.id.addedBy);
		TextView upVotes = (TextView) v.findViewById(R.id.votesUp);
		TextView downVotes = (TextView) v.findViewById(R.id.votesDown);
		songName.setText(listItem.songName);
		artistName.setText(listItem.songArtist);
		addedBy.setText("Added by " + listItem.addedBy);
		upVotes.setText(String.valueOf(listItem.upVotes));
        downVotes.setText(String.valueOf(listItem.downVotes));

		return v;
	}
}
