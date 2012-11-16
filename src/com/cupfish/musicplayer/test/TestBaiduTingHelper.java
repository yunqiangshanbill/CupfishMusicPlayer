package com.cupfish.musicplayer.test;

import java.util.List;

import android.test.AndroidTestCase;

import com.cupfish.musicplayer.domain.Album;
import com.cupfish.musicplayer.domain.Song;
import com.cupfish.musicplayer.exception.NetTimeoutException;
import com.cupfish.musicplayer.utils.BaiduTingHelper;
import com.cupfish.musicplayer.utils.GoogleMusicHelper;

public class TestBaiduTingHelper extends AndroidTestCase {

	public void testGetSongById() throws NetTimeoutException{
		Song song = BaiduTingHelper.getSongById("13932461");
		System.out.println(song);
	}
	
	public void testGetUrl() throws NetTimeoutException{
		String url = BaiduTingHelper.getDownloadUrlBySongId("31149822");
		System.out.println(url);
	}
	
	public void testGetSongsByTitle() throws NetTimeoutException{
		List<Song> songs = BaiduTingHelper.getSongsByTitle("断点");
		System.out.println(songs.size());
		for(Song s : songs){
			System.out.println(s);
		}
	}
	
	public void testGetSongsFromBaidu() throws NetTimeoutException{
		List<Song> songs = BaiduTingHelper.getSongsFromBaidu(BaiduTingHelper.TopListType.NEW_100);
		System.out.println("SIZE:" + songs.size());
		for(Song song : songs){
			System.out.println("TITLE:" + song.getTitle() + " ID:" + song.getId());
		}
	}
	
	public void testGetAlbumById() throws NetTimeoutException{
		Album a = BaiduTingHelper.getAlbumById("31149823", true);
		System.out.println(a);
	}
	
}
