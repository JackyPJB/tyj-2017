package cn.tyj.web.controller.wx;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Binary Wang
 */

@RestController
@RequestMapping("/wechat/portal")
public class WxMpPortalController {
  
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @ResponseBody
  @GetMapping(produces = "text/plain;charset=utf-8")
  public String authGet(@RequestParam(name = "signature", required = false) String signature,
      @RequestParam(name = "timestamp", required = false) String timestamp,
      @RequestParam(name = "nonce", required = false) String nonce,
      @RequestParam(name = "echostr", required = false) String echostr) {
	  WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
	  config.setAppId("wxea9a59d20ee4479b"); // 设置微信公众号的appid
	  config.setSecret("543714d1001fc6a480758c7dbba44818"); // 设置微信公众号的app corpSecret
	  config.setToken("5a3281bb34efed3cee98b3200b66ef51"); // 设置微信公众号的token
	  config.setAesKey("Blwwlyl3umfAQfpnV75LT2LyD2mQVsx1RpHzhfUXGOc"); // 设置微信公众号的EncodingAESKey

	  WxMpService wxService = new WxMpServiceImpl();
	  wxService.setWxMpConfigStorage(config);


    this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature, timestamp, nonce, echostr);

    if (StringUtils.isAnyBlank(signature, timestamp, nonce, echostr)) {
      throw new IllegalArgumentException("请求参数非法，请核实!");
    }

    if (wxService.checkSignature(timestamp, nonce, signature)) {
      return echostr;
    }

    return "非法请求";
  }

  @ResponseBody
  @PostMapping(produces = "application/xml; charset=UTF-8")
  public String post(@RequestBody String requestBody, @RequestParam("signature") String signature,
					 @RequestParam(name = "encrypt_type", required = false) String encType,
					 @RequestParam(name = "msg_signature", required = false) String msgSignature,
					 @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce) throws WxErrorException{
    this.logger.info(
        "\n接收微信请求：[signature=[{}], encType=[{}], msgSignature=[{}],"
            + " timestamp=[{}], nonce=[{}], requestBody=[\n{}\n] ",
        signature, encType, msgSignature, timestamp, nonce, requestBody);
	  WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
	  config.setAppId("wxea9a59d20ee4479b"); // 设置微信公众号的appid
	  config.setSecret("543714d1001fc6a480758c7dbba44818"); // 设置微信公众号的app corpSecret
	  config.setToken("5a3281bb34efed3cee98b3200b66ef51"); // 设置微信公众号的token
	  config.setAesKey("Blwwlyl3umfAQfpnV75LT2LyD2mQVsx1RpHzhfUXGOc"); // 设置微信公众号的EncodingAESKey

	  WxMpService wxService = new WxMpServiceImpl();
	  wxService.setWxMpConfigStorage(config);
    if (!wxService.checkSignature(timestamp, nonce, signature)) {
      throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
    }

	  if (encType == null) {
		  // 明文传输的消息
		  WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
		  WxMpKefuMessage message = WxMpKefuMessage
				  .TEXT()
				  .toUser("oI3ZYwesOLFi3ulFTJlo5hecpEOI")
				  .content("sfsfdsdf"+inMessage.getContent()+"  OpenID: " + inMessage.getFromUser())
				  .build();
		  wxService.getKefuService().sendKefuMessage(message);
    }
    return null;

  }


}
