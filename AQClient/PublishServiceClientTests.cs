using System;
using Aquarius.Webclient;
using NUnit.Framework;

namespace AQClient
{
    [TestFixture]
    class PublishServiceClientTests
    {
        [Test]
        [Category("SoapService")]
        public void GetAuthToken_BasicBinding_Succeeds()
        {
            using (var apsClient = AQWSFactory.NewAPSClient(TestContext.PublishServiceUrl))
            {
                string token = null;
                Assert.DoesNotThrow(() => token = apsClient.GetAuthToken(TestContext.User, TestContext.Pwd));
                Assert.IsFalse(String.IsNullOrEmpty(token));
            }
        }

        [Test]
        [Category("AqListener")]
        public void GetAuthToken_AqListener_BasicBinding_Succeeds()
        {
            using (var apsClient = AQWSFactory.NewAPSClient(TestContext.PublishServiceAqListenerUrl))
            {
                string token = null;
                Assert.DoesNotThrow(() => token = apsClient.GetAuthToken(TestContext.User, TestContext.Pwd));
                Assert.IsFalse(String.IsNullOrEmpty(token));
            }
        }

        [Test]
        [Category("RestService")]
        public void GetAuthToken_Http_Succeeds()
        {
            var url = TestContext.PublishServiceGetAuthTokenUrl;
            string token = null;
            Assert.DoesNotThrow(() => token = AQWSFactory.HttpGet(url, null));
            Assert.IsFalse(String.IsNullOrEmpty(token));
        }

        [Test]
        [Category("RestService")]
        [Category("AqListener")]
        public void GetAuthToken_AqListener_Http_Succeeds()
        {
            var url = TestContext.PublishServiceGetAuthTokenAqListenerUrl;
            string token = null;
            Assert.DoesNotThrow(() => token = AQWSFactory.HttpGet(url, null));
            Assert.IsFalse(String.IsNullOrEmpty(token));
        }
        
    }
}
