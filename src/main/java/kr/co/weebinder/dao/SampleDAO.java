package kr.co.weebinder.dao;

import kr.co.weebinder.dto.Sample;

import java.util.List;

public interface SampleDAO {
    public List<Sample> sampleList() throws Exception;
    public Sample sampleDetail(int no) throws Exception;
    public void sampleInsert(Sample sample) throws Exception;
    public void sampleUpdate(Sample sample) throws Exception;
    public void sampleDelete(int no) throws Exception;
}
