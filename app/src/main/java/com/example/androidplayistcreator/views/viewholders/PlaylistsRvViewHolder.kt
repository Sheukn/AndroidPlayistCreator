package com.example.androidplayistcreator.views.viewholders

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidplayistcreator.R
import com.example.androidplayistcreator.activities.TrackListActivity
import com.example.androidplayistcreator.models.Playlist

class PlaylistsRvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val playlistImage: ImageView = itemView.findViewById(R.id.playlist_id)
    val playlistTitle: TextView = itemView.findViewById(R.id.playlist_title)

    // You can add methods to bind data if needed
    fun bind(playlist: Playlist) {
        playlistTitle.text = playlist.name

        itemView.setOnClickListener {
            val context = itemView.context
            val intent = Intent(context, TrackListActivity::class.java).apply {
                putExtra("PLAYLIST_ID", playlist.id)  // Pass playlist ID
                putExtra("PLAYLIST_NAME", playlist.name)  // Pass playlist name
            }
            context.startActivity(intent)
        }
    }
}