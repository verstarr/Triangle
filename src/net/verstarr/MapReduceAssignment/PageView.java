package org.myorg;

import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

import org.apache.log4j.Logger;

public class PageView implements WritableComparable {
	private Text day;
	private Text ab_test_campaign;
	private Text ab_test_variant;
	
	public PageView(Text day, Text ab_test_campaign, Text ab_test_variant) {
		this.day = day;
		this.ab_test_campaign = ab_test_campaign;
		this.ab_test_variant = ab_test_variant;
	}
	
	public PageView() {
		this.day = new Text();
		this.ab_test_campaign = new Text();
		this.ab_test_variant = new Text();
	}
	
	public void write(DataOutput out) throws IOException {
		
	}
	
	public void readFields(DataInput in) {
		day.readFields(in);
		ab_test_campaign.readFields(in);
		ab_test_variant.readFields(in);
	}
	
	public int compareTo(PageView pv) {
		if (pv == null)
			return 0;
		int intday = day.compareTo(pv.day);
		if (intday != 0)
			return intday;
		else {
			int int_ab_test_campaign = ab_test_campaign.compareTo(pv.ab_test_campaign);
			if (int_ab_test_campaign != 0)
				return int_ab_test_campaign;
			else {
				return ab_test_variant.compareTo(pv.ab_test_variant);
			}
		}
	}
	
	@Override
	public String toString() {
		return day.toString() + ":" + ab_test_campaign.toString() + ":" + ab_test_variant.toString(); 
	}
}