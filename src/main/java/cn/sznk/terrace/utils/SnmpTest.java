package cn.sznk.terrace.utils;

import java.util.ArrayList;
import java.util.List;
import org.snmp4j.log.ConsoleLogFactory;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;


public class SnmpTest {

	public String testGet(String ip,String community,String oidval)
	{
		return SnmpData.snmpGet(ip, community, oidval);
	}


	public List<String> testGetList(String ip,String community,List<String> oidList){
		List<String> snmpGetList = SnmpData.snmpGetList(ip, community, oidList);
		return snmpGetList;
	}


	public void testGetAsyList()
	{
		String ip = "127.0.0.1";
		String community = "public";
		List<String> oidList=new ArrayList<String>();
		oidList.add("1.3.6.1.2.1");
		oidList.add("1.3.6.1.2.12");
		SnmpData.snmpAsynGetList(ip, community, oidList);
		System.out.println("i am first!");
	}


	public void testWalk()
	{
		String ip = "192.168.0.108";
		String community = "xplinux123";
		String oidval = ".1.3.6.1.2.1.31.1.1.1.6";
		SnmpData.snmpWalk(ip, community, oidval);
	}


	public void testAsyWalk()
	{
		String ip = "127.0.0.1";
		String community = "public";
		// 异步采集数据
		SnmpData.snmpAsynWalk(ip, community, "1.3.6.1.2.1.25.4.2.1.2");
	}


	public void testSetPDU() throws Exception
	{
		String ip = "127.0.0.1";
		String community = "public";
		SnmpData.setPDU(ip, community, "1.3.6.1.2.1.1.6.0","jianghuiwen");
	}


	public void testVersion()
	{
		System.out.println(org.snmp4j.version.VersionInfo.getVersion());
	}
}
