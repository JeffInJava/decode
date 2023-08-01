package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.common.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.UUID;

/**
 * @Author: Y Hz
 * @DATE: 2022/8/29
 * @PROJECT_NAME: demo
 * @PACKAGE_NAME: com.example.demo.controller
 * @Description:
 */
@RestController
@RequestMapping("/log")
public class LogController {


    private static final String TAG = "LogController";

    private static final Logger logger = LoggerFactory.getLogger(TAG);

    @RequestMapping("/printLog")
    public String getAsyncConfig(@RequestBody JSONObject param) {
        logger.info(param.toJSONString());
        return param.toJSONString();
    }

    @PostMapping("/testJson")
    @ResponseBody
    public AjaxResult testJson(@RequestBody JSONObject obj) {
        String sss = obj.toString();
        System.out.println("testJson----：   " + sss);
        AjaxResult ajaxresult = new AjaxResult();
        String ss = "{\n" +
                "  \"data\": {\n" +
                "    \"powerTransTime\": \"20230418155411\",\n" +
                "    \"resultLists\": {\n" +
                "      \"resultList\": {\n" +
                "        \"FDL1\": \"134\",\n" +
                "        \"DH\": \"3260915057\",\n" +
                "        \"HM\": \"张警卫\",\n" +
                "        \"EDJS\": \"2040\",\n" +
                "        \"pdl1\": \"0\",\n" +
                "        \"HJJE_CAP\": \"玖拾叁元整\",\n" +
                "        \"by13\": \"0\",\n" +
                "        \"ZRXQ\": \"0.16\",\n" +
                "        \"KPDW\": \"国网江苏省电力有限公司南京供电分公司\",\n" +
                "        \"HJJE\": \"93\",\n" +
                "        \"SY12\": \"688\",\n" +
                "        \"SY11\": \"1326\",\n" +
                "        \"GDL1\": \"51\",\n" +
                "        \"BY14\": \"689\",\n" +
                "        \"BY12\": \"822\",\n" +
                "        \"BY11\": \"1511\",\n" +
                "        \"WYJ\": \"0\",\n" +
                "        \"YBJE\": \"0.0\",\n" +
                "        \"periodCode\": \"0\",\n" +
                "        \"SY14\": \"638\",\n" +
                "        \"SQZR\": \"0.08\",\n" +
                "        \"isywbg\": \"01\",\n" +
                "        \"YDJS\": \"2760\",\n" +
                "        \"sy13\": \"0\",\n" +
                "        \"YTJE\": \"15.26\",\n" +
                "        \"YDYY\": \"248\",\n" +
                "        \"FDJ1\": \"0.5583\",\n" +
                "        \"ZJRQ\": \"20230418155411\",\n" +
                "        \"YDDZ\": \"大厂毕洼西路229号15幢2单元304室\",\n" +
                "        \"FDF1\": \"74.81\",\n" +
                "        \"pdf1\": \"0\",\n" +
                "        \"NY\": \"202303\",\n" +
                "        \"pdj1\": \"0\",\n" +
                "        \"CL14\": \"1\",\n" +
                "        \"CL12\": \"1\",\n" +
                "        \"CL11\": \"1\",\n" +
                "        \"zdzq\": \"2023/01/20-2023/02/28\",\n" +
                "        \"KYYE\": \"15.26\",\n" +
                "        \"ZHH\": \"3200151025186\",\n" +
                "        \"ZDF\": \"93.08\",\n" +
                "        \"EDYY\": \"0\",\n" +
                "        \"ZDJ\": \"0\",\n" +
                "        \"GDJ1\": \"0.3583\",\n" +
                "        \"SFY\": \"窦洁\",\n" +
                "        \"XSDW\": \"国网江苏省电力有限公司南京供电分公司\",\n" +
                "        \"YGZL\": \"185\",\n" +
                "        \"GDF1\": \"18.27\",\n" +
                "        \"dbbh\": \"1557682796\",\n" +
                "        \"JJ1\": \"0\",\n" +
                "        \"xj\": \"93.08\",\n" +
                "        \"JJ4\": \"0\",\n" +
                "        \"DB4\": \"0\",\n" +
                "        \"YSJE\": \"93\",\n" +
                "        \"THIS_YMD\": \"2023-03-01 00:00:00\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"payMode\": \"0101\",\n" +
                "    \"count\": \"1\",\n" +
                "    \"powerSupplyflowNum\": \"2023041803490410\",\n" +
                "    \"rtnMsg\": \"月度账单处理成功\",\n" +
                "    \"rtnCode\": \"0\"\n" +
                "  }\n" +
                "}";
        ajaxresult.put("data", JSONObject.parse(ss));
        return ajaxresult;
    }

    @PostMapping("/testJson2")
    @ResponseBody
    public AjaxResult testJson2(@RequestBody JSONObject obj) {
        String sss = obj.toString();
        System.out.println("testJson----2：   " + sss);
        AjaxResult ajaxresult = new AjaxResult();
        String ss = "{\n" +
                "    \"code\": \"1\",\n" +
                "    \"data\": {\n" +
                "        \"data\": {\n" +
                "            \"RTN_CODE\": \"1\",\n" +
                "            \"RTN_MSG\": \"成功\",\n" +
                "            \"Lists\": {\n" +
                "                \"List\": [\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202207\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/07/31\",\n" +
                "                        \"calcId\": \"3200000746427373\",\n" +
                "                        \"wyj\": \"524.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/07/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"16448\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"10923.78\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202208\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/08/31\",\n" +
                "                        \"calcId\": \"3200000779396288\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/08/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"5176\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"3561.64\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202209\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/09/30\",\n" +
                "                        \"calcId\": \"3200000815459078\",\n" +
                "                        \"wyj\": \"14.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/09/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"2472\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"1829.64\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202210\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/10/31\",\n" +
                "                        \"calcId\": \"3200010929279935\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/10/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"2776\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2019.17\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202211\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/11/30\",\n" +
                "                        \"calcId\": \"3200011208244298\",\n" +
                "                        \"wyj\": \"8.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/11/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"2956\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2048.89\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202212\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2022/12/31\",\n" +
                "                        \"calcId\": \"3200011710953508\",\n" +
                "                        \"wyj\": \"5.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2022/12/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"4004\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2798.06\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202301\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/01/31\",\n" +
                "                        \"calcId\": \"3200012104304742\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/01/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"3740\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2576.49\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202302\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/02/28\",\n" +
                "                        \"calcId\": \"3200012513495128\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/02/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"3744\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2622.39\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202303\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/03/31\",\n" +
                "                        \"calcId\": \"3200012926023814\",\n" +
                "                        \"wyj\": \"9.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/03/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"7104\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"4904.94\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202304\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/04/30\",\n" +
                "                        \"calcId\": \"3200013265782187\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/04/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"5312\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"3675.16\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202305\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/05/31\",\n" +
                "                        \"calcId\": \"3200013729306964\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/05/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"3672\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"2636.37\"\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"mgtOrgCode\": \"3240101\",\n" +
                "                        \"dfny\": \"202306\",\n" +
                "                        \"custNo\": \"3200157092563\",\n" +
                "                        \"yhlx\": \"01\",\n" +
                "                        \"jszdzq\": \"2023/06/30\",\n" +
                "                        \"calcId\": \"3200014185042991\",\n" +
                "                        \"wyj\": \"0.00\",\n" +
                "                        \"istb\": \"0\",\n" +
                "                        \"kszdzq\": \"2023/06/01\",\n" +
                "                        \"jqzt\": \"03\",\n" +
                "                        \"ygzl\": \"10904\",\n" +
                "                        \"isqt\": \"0\",\n" +
                "                        \"zdf\": \"7817.65\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    },\n" +
                "    \"message\": \"服务请求成功！\"\n" +
                "}";
        ajaxresult.put("data", JSONObject.parse(ss));
        return ajaxresult;
    }

    @RequestMapping("download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表单传来的名" + fileName);

        //获取文件地址
        String realPath = "E:\\download";

        // 将文件写入输入流
        FileInputStream fileInputStream = new FileInputStream(new File(realPath, fileName));
        InputStream fis = new BufferedInputStream(fileInputStream);
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();

        // 清空response
        response.reset();
        // 设置response的Header
        response.setCharacterEncoding("UTF-8");
        //Content-Disposition的作用：告知浏览器以何种方式显示响应返回的文件，用浏览器打开还是以附件的形式下载到本地保存
        //attachment表示以附件方式下载 inline表示在线打开 "Content-Disposition: inline; filename=文件名.mp3"
        // filename表示文件的默认名称，因为网络传输只支持URL编码的相关支付，因此需要将文件名URL编码后进行传输,前端收到后需要反编码才能获取到真正的名称
        response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        // 告知浏览器文件的大小
//        response.addHeader("Content-Length", "" + file.length());
        OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        outputStream.write(buffer);
        outputStream.flush();
    }

    /**
     * 1.文件保存在服务器，url地址保存在数据库
     * 上传成功之后返回成功保存的url地址
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (request != null) {
            Enumeration<String> headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String name = headerNames.nextElement();
                System.out.println("-------" + name + " =" + request.getHeader(name));
            }
        }
        if (!file.isEmpty()) {
            String uploadPath = "D:\\uploadFile";
            // 如果目录不存在则创建
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
            String OriginalFilename = file.getOriginalFilename();//获取原文件名
            String suffixName = OriginalFilename.substring(OriginalFilename.lastIndexOf("."));//获取文件后缀名
            //重新随机生成名字
            String filename = UUID.randomUUID().toString() + suffixName;
            File localFile = new File(uploadPath + "\\" + filename);
            try {
                file.transferTo(localFile); //把上传的文件保存至本地
                /**
                 * 这里应该把filename保存到数据库,供前端访问时使用
                 * */
                return filename;//上传成功，返回保存的文件地址
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("上传失败");
                return "";
            }
        } else {
            System.out.println("文件为空");
            return "";
        }
    }
}
