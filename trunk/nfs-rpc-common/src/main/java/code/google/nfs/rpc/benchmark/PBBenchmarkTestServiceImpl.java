/**
 * nfs-rpc
 *   Apache License
 *   
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */
package code.google.nfs.rpc.benchmark;

import com.google.protobuf.ByteString;

/**
 * Just for Reflection RPC Benchmark
 * 
 * @author <a href="mailto:bluedavy@gmail.com">bluedavy</a>
 */
public class PBBenchmarkTestServiceImpl implements BenchmarkTestService {

	private int responseSize;
	
	public PBBenchmarkTestServiceImpl(int responseSize){
		this.responseSize = responseSize;
	}
	
	// support java/hessian/pb codec
	public Object execute(Object request) {
		PB.ResponseObject.Builder  builder = PB.ResponseObject.newBuilder();
		builder.setBytesObject(ByteString.copyFrom(new byte[responseSize]));
		return builder.build();
	}

}
