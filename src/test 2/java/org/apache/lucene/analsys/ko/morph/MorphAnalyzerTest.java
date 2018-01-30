package org.apache.lucene.analsys.ko.morph;

import java.util.List;

import org.apache.lucene.analysis.ko.morph.AnalysisOutput;
import org.apache.lucene.analysis.ko.morph.MorphAnalyzer;

import junit.framework.TestCase;

public class MorphAnalyzerTest extends TestCase {

	public void testMorphAnalyzer() throws Exception {
		//사랑이 그대에게 말하거든 그를 믿으십시오.
		String[] inputs = new String[]{"지고","나도","가진","등에","이루","만들어버린다"};
		
		MorphAnalyzer analyzer = new MorphAnalyzer();
		
		for(String input : inputs) {
			analyzer.setDivisibleOne(true);
			
			List<AnalysisOutput> oList = analyzer.analyze(input);
			for(AnalysisOutput o : oList) {
				System.out.println(o.toString() + "/"+o.getScore()+":"+o.getCNounList().size());
			}
			
//			analyzer.setDivisibleOne(false);
//			oList = analyzer.analyze(input);
//			for(AnalysisOutput o : oList) {
//				System.out.println(o.toString() + "/"+o.getScore()+":"+o.getCNounList().size());
//			}
		}
	}
	
}
