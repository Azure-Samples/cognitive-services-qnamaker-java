# Cognitive Services QnA Maker Samples in Java

These samples show you how to programmatically create, update, publish, and replace a QnA Maker knowledge base, amongst many other ways to interact with it. All samples are in Java. To view these same samples in other languages:

[cognitive-services-qnamaker-csharp](https://github.com/Azure-Samples/cognitive-services-qnamaker-csharp)

[cognitive-services-qnamaker-nodejs](https://github.com/Azure-Samples/cognitive-services-qnamaker-nodejs)

[cognitive-services-qnamaker-python](https://github.com/Azure-Samples/cognitive-services-qnamaker-python)

## Features

Included are the following samples:

* [Create knowledge base](https://github.com/Azure-Samples/cognitive-services-qnamaker-python/blob/master/create-new-knowledge-base.java). Create a brand new knowledge base with given FAQ URLs. You may supply your own.
* [Update knowledge base](https://github.com/Azure-Samples/cognitive-services-qnamaker-python/blob/master/update-knowledge-base.java). Update an existing knowledge base by changing its name.
* [Publish knowledge base](https://github.com/Azure-Samples/cognitive-services-qnamaker-python/blob/master/publish-knowledge-base.java). Publish any existing knowledge base to the host your Azure account.
* [Replace knowledge base](https://github.com/Azure-Samples/cognitive-services-qnamaker-python/blob/master/replace-knowledge-base.java). Replace an entire existing knowledge base with a custom question/answer pair.
* [Download knowledge base](https://github.com/Azure-Samples/cognitive-services-qnamaker-python/blob/master/download-knowledge-base.java). Download the contents of your existing knowledge base in JSON.

All samples revolve around what you can do with a knowledge base, which is made up of FAQs or product manuals where there is a question and an answer. QnA Maker gives you more control over how to answer questions by allowing you to train a chat bot to give answers in a variety of ways that feels more like natural, conversational exchanges.

<img src="https://docs.microsoft.com/en-us/azure/cognitive-services/qnamaker/media/botFrameworkArch.png" width="700">

## Getting Started

### Prerequisites

For each sample, a subscription key is required from your Azure Portal account. 
* To create a new account/resource for QnA Maker, see [Create a Cognitive Services API account in the Azure portal](https://docs.microsoft.com/en-us/azure/cognitive-services/cognitive-services-apis-create-account). You may need to 'Search in Marketplace' for QnA Maker if you don't see it in the list given.  
* For existing accounts, the key can be found in your [Azure Portal](https://ms.portal.azure.com/) dashboard in your QnA Maker resource under Resource Management > Keys. 

With the exception of creating a new knowledge base, these samples will require your [QnA Maker account](https://www.qnamaker.ai/Home/MyServices) knowledge base ID. 

### Run the sample

1. Use your favorite IDE for this sample. [IntelliJ IDEA](https://www.jetbrains.com/idea/) is used here. This IDE has a free evaluation version.

1. Create a new Java project, using the SDK 10. The simplest way to test these samples is to add a new class to the project's `src` folder for each sample.

1. Copy/paste the sample code into the corresponding class.

1. Add the [Google GSON library](https://github.com/google/gson) to your Java project, either by manually [creating](https://stackoverflow.com/questions/5258159/how-to-make-an-executable-jar-file) & [importing](https://stackoverflow.com/questions/21051991/importing-jar-file-into-intellij-idea) the .jar file or adding a dependency to your preferred project management tool, such as Maven.

1. Add your subscription key (from Azure portal) and (if applicable) your knowledge base ID (from qnamaker.ai) as requested in the variables at the top of the class.

1. Run your project.

### Quickstart

* Quickstart: [Create a new knowledge base in Java](https://docs.microsoft.com/en-us/azure/cognitive-services/qnamaker/quickstarts/create-new-kb-java)
* Quickstart: [Update a knowledge base in Java](https://docs.microsoft.com/en-us/azure/cognitive-services/qnamaker/quickstarts/update-kb-java)
* Quickstart: [Publish a knowledge base in Java](https://docs.microsoft.com/en-us/azure/cognitive-services/qnamaker/quickstarts/publish-kb-java)
* More quickstarts coming soon... in the meantime, refer to [Quickstart for Microsoft QnA Maker API with Java](https://docs.microsoft.com/en-us/azure/cognitive-services/qnamaker/quickstarts/java) for all quickstarts in minimal format.

## References

[QnA Maker V4.0](https://westus.dev.cognitive.microsoft.com/docs/services/5a93fcf85b4ccd136866eb37/operations/5ac266295b4ccd1554da75ff)
