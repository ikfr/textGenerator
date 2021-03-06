package com.github.hzqd.ikfr.textGenerator.textType.science.textSource

import arrow.core.Some

fun english(block: Structure.() -> Unit) = Structure().apply(block)

val en = english {
    //结果的部分
    结目的 = Some(
        listOf(
            "The first set of questions aimed to …",
            "To compare the difference between …",
            "The purpose of Experiment was to …",
            "Simple statistical analysis was used to …",
            "The next question asked the informants …",
            "To assess 主题, the 同义词 research was used.",
            "Changes in 主题 and 同义词 were compared using …",
            "Regression analysis was used to predict the …",
            "To distinguish between these two possibilities, …",
            "The first set of analyses examined the impact of …",
            "The correlation between 主题 and 同义词 was tested using …",
            "T-tests were used to analyse the relationship between …",
            "The average scores of 主题 and 同义词 were compared in order to …",
            "In order to assess 近义词, repeated-measures ANOVAs were used.",
            "Nine items on the research measured the extent to which …"
        )
    )
    结数据 = Some(
        listOf(
            "What stands out in the table is …",
            "Closer inspection of the table shows …",
            "It is apparent from this table that very few …",
            "The most interesting aspect of this graph is …",
            "In Fig.1 there is a clear trend of decreasing …",
            "What is striking about the figures in this table is …",
            "What is interesting about the data in this table is that …",
            "The differences between 主题 and 同义词 are highlighted in Table 4.",
            "From the chart, it can be seen that by far the greatest demand is for …",
            "From this data, we can see that Study 2 resulted in the lowest value of …",
            "This table is quite revealing in several ways. First, unlike the other tables …",
            "From the data in Figure 9, it is apparent that the length of time left between …",
            "Data from this table can be compared with the data in Table 4.6 which shows …",
            "As Table III shows, there is a significant difference (t = -2.15, p = 0.03) between the two groups."
        )
    )
    正数据 = Some(
        listOf(
            "The mean score for 主题 was …",
            "Further analysis showed that …",
            "Further statistical tests revealed …",
            "A two-way ANOVA revealed that …",
            "On average, 主题s were shown to have …",
            "Strong evidence of 主题 was found when …",
            "This result is significant at the p = 0.05 level.",
            "The results, as shown in Table 1, indicate that …",
            "A positive correlation was found between 主题 and 同义词.",
            "There was a significant positive correlation between …",
            "The difference between the 主题 and 同义词 groups was significant.",
            "There was a significant difference in 主题, t(11) = 2.906, p<0.01",
            "There was a significant difference between the two conditions …",
            "Respondents who reported low levels of 主题 also reported significantly lower levels of 同义词."
        )
    )
    负数据 = Some(
        listOf(
            "No increase in 主题 was detected.",
            "No difference greater than 主题 was observed.",
            "No significant differences were found between …",
            "None of these differences were statistically significant.",
            "No significant difference between the two groups was evident.",
            "No significant reduction in 主题 was found compared with placebo.",
            "No evidence was found for non-linear associations between 主题 and 同义词.",
            "No significant correlation was found between 主题 scores and the 同义词 scores (p = .274)",
            "主题 appeared to be unaffected by 同义词.",
            "Only trace amounts of 主题 were detected in …",
            "There was no evidence that 主题 has an influence on …",
            "The Chi-square test did not show any significant differences between …",
            "Overall, 主题 did not affect males and females differently in these measures.",
            "A clear benefit of 主题 in the prevention of 同义词 could not be identified in this analysis.",
            "T-tests found no significant differences in mean scores on the 主题 and 同义词 subscales."
        )
    )
    两数据 = Some(
        listOf(
            "Stimulation of 主题 cells with 同义词 did not increase the …",
            "With successive increases in intensity of the 主题, the 同义词 moved further to …",
            "Following the addition of 主题, a significant increase (P<0.05) in the 同义词 was recorded.",
            "When 主题 cells were stimulated with 同义词, no significant difference in the number of 近义词 was detected."
        )
    )
    亮数据 = Some(
        listOf(
            "Interestingly, the 主题 was observed to …",
            "This result is somewhat counterintuitive.",
            "Interestingly, this correlation is related to …",
            "The more surprising correlation is with the …",
            "Surprisingly, only a minority of respondents …",
            "The most surprising aspect of the data is in the …",
            "The correlation between 主题 and 同义词 is interesting because …",
            "The most striking result to emerge from the data is that …",
            "Interestingly, there were also differences in the ratios of …",
            "The single most striking observation to emerge from the data comparison was …"
        )
    )
    效数据 = Some(
        listOf(
            "Although the some response to the research was poor.",
            "Thirty-two individuals returned the researchs.",
            "The response rate was 60% at six months and 56% at 12 months.",
            "Of the study population, 90 subjects completed and returned the research.",
            "Of 150 individuals who were sent invitations, 81 returned the reply slip, of whom 60 agreed to …",
            "By the end of the research period, data had been collected from 64 individuals, 23 of whom were …",
            "There were 53 responses to the question: ‘…?’",
            "Respondents were asked to indicate whether …",
            "The total number of responses for this question was …",
            "The overall response to this question was very positive.",
            "Respondents were asked to suggest other reasons for …",
            "In response to the question: ‘…?’, a range of responses was elicited.",
            "This section of the research required respondents to give information on …"
        )
    )
    比数据 = Some(
        listOf(
            "Over half of those researched reported that …",
            "A minority of participants (17%) indicated that …",
            "70% of those who were interviewed indicated that ….",
            "Almost two-thirds of the participants (64%) said that ….",
            "The majority of those who responded to this item felt that …",
            "When asked whether …, 90% of the respondents reported that …",
            "Just over half of those who answered this question reported that …",
            "In response to Question 1, most of those researched indicated that …",
            "When the participants were asked ……, the majority commented that …",
            "Of the 148 patients who completed the research, just over half indicated that …"
        )
    )
    场数据 = Some(
        listOf(
            "Another reported problem was …",
            "Opinions differed as to whether …",
            "Concerns were expressed about …",
            "A number of issues were identified …",
            "A variety of perspectives were expressed …",
            "These views surfaced mainly in relation to …",
            "Concerns regarding 主题 were more widespread.",
            "There was a sense of 主题 amongst results.",
            "Five broad themes emerged from the analysis.",
            "A common view amongst results was that …",
            "One concern expressed regarding 主题 was whether …",
            "This theme came up for example in discussions of …",
            "The themes of 主题 and 同义词 recurred throughout the dataset.",
            "Two divergent and often conflicting discourses emerged …",
            "Two discrete reasons emerged from this. First … Second …",
            "Issues related to 主题 were not particularly prominent in the interview data.",
            "A recurrent theme in the interviews was a sense amongst results that …"
        )
    )
    另数据 = Some(
        listOf(
            "It was suggested that …",
            "One result argued that …",
            "There were some suggestions that …",
            "In all cases, the informants reported that …",
            "In their accounts of the events surrounding …",
            "There were some negative comments about …",
            "The participants on the whole demonstrated …",
            "Some felt that … , while others considered that …",
            "Some results argued that … , while others …",
            "This view was echoed by another informant who ..",
            "Whilst a minority mentioned that…, all agreed that…",
            "Only a small number of respondents indicated that …",
            "A small number of those interviewed suggested that ….",
            "For a small number of participants 主题 was the reason for …",
            "The majority of participants agreed with the statement that …",
            "When asked about 主题, the participants were unanimous in the view that …"
        )
    )
    外数据 = Some(
        listOf(
            "As one result shows that ‘…’",
            "As one interviewee put it: ‘…’",
            "One informant reported that …",
            "The comment below illustrates …",
            "One participant commented: ‘ …’",
            "For example, one interviewee said: ‘…’",
            "In one case, the participant thought that …",
            "Another interviewee, when asked …, said: ‘…’",
            "Other responses to this question included: ‘…’",
            "Another interviewee alluded to the notion of …",
            "Talking about this issue an interviewee said: ‘…’",
            "Commenting on 主题, one of the interviewees said …",
            "One individual stated that ‘…’ And another commented ‘…’"
        )
    )
    结过渡 = Some(
        listOf(
            "If we now turn to …",
            "A comparison of the two results reveals …",
            "Turning now to the experimental evidence on …",
            "Comparing the two results, it can be seen that …",
            "The next section of the research was concerned with …",
            "In the final part of the research, respondents were asked …"
        )
    )
    结论点 = Some(
        listOf(
            "These results suggest that …",
            "Overall, these results indicate that …",
            "In summary, these results show that …",
            "In summary, for the informants in this study, …",
            "Together these results provide important insights into …",
            "Taken together, these results suggest that there is an association between …",
            "The results in this chapter indicate that … The next chapter, therefore, moves on to discuss the …"
        )
    )

//证言的部分
    泛相关 = Some(
        listOf(
            "The literature on 主题 has highlighted several …",
            "Different theories exist in the literature regarding …",
            "More recent attention has focused on the provision of …",
            "There are relatively few historical studies in the area of …",
            "A large and growing body of literature has investigated …",
            "Much of the literature since the mid-时间 emphasises the …",
            "Much of the current literature on 主题 pays particular attention to …",
            "There is a large volume of published studies describing the role of …",
            "The existing literature on 主题 is extensive and focuses particularly on …",
            "There is a relatively small body of literature that is concerned with …",
            "The generalisability of much published research on this issue is problematic.",
            "A considerable amount of literature has been published on 主题. These studies …",
            "Previous research findings into 主题 have been inconsistent and contradictory (作者, 时间; …).",
            "The academic literature on 主题 has revealed the emergence of several contrasting themes."
        )
    )
    远相关 = Some(
        listOf(
            "Research into 主题 has a long history.",
            "For many years, this phenomenon was surprisingly neglected by …",
            "Only in the past ten years have studies of 主题 directly addressed how …",
            "Prior to the work of 作者 (时间), the role of 主题 was largely unknown.",
            "Over the past decade, most research in 主题 has emphasized the use of …",
            "In recent years, there has been an increasing amount of literature on …",
            "Early examples of research into 主题 include … (作者, 时间).",
            "During the past 30 years, much more information has become available on …",
            "The first serious discussions and analyses of 主题 emerged during the 时间 with …",
            "Over the past two decades, major advances in 上级 have allowed …",
            "Historically, research investigating the factors associated with 主题 has focused on …",
            "It is only since the work of 作者 (时间) that the study of 主题 has gained momentum.",
            "The construct of 主题 was first articulated by 作者 (时间) and popularised in his book: …",
            "Around the early 时间, small-scale research and case studies began to emerge linking …",
            "It was not until the late 时间 that historians considered 主题 worthy of scholarly attention.",
            "Awareness of 主题 is not recent, having possibly first been described in the 5th century BCE by …"
        )
    )
    域相关 = Some(
        listOf(
            "To date, several studies have investigated 主题 …",
            "A number of studies have begun to examine 主题 …",
            "Various studies have assessed the efficacy of 主题 …",
            "Researchers attempted to evaluate the impact of 主题 …",
            "A great deal of previous research into 主题 has focused on …",
            "Several studies have used longitudinal data to examine …",
            "Previous studies have explored the relationships between 主题 and 同义词.",
            "Twenty cohort study analyses have examined the relationship between …",
            "A number of authors have considered the effects of … (作者, 时间).",
            "At least 120 case-control studies worldwide have examined the relationship between 主题 and 同义词 …",
            "Numerous studies have attempted to explain … (for example, 作者, 时间)."
        )
    )
    近相关 = Some(
        listOf(
            "Several lines of evidence suggest that …",
            "Previous research has established that …",
            "Data from several studies suggest that …",
            "It is now well established from a variety of studies that …",
            "A number of studies have postulated a convergence between …",
            "Surveys such as that conducted by 作者 (时间) have shown that …",
            "Many recent studies (e.g. 作者, 时间; 作者, 时间) have shown that …",
            "Traditionally, it has been argued that … (e.g. 作者, 时间).",
            "Severalresearchers of 上级 have been published. 作者 (时间) presents …",
            "In previous studies on 主题, different variables have been found to be related to …",
            "Many historians have argued that … (e.g. 作者, 时间; Johnson, 时间; 作者, 时间).",
            "There is a consensus among social scientists that … (e.g. 作者, 时间",
            "Data from several sources have identified the increased 主题 and 同义词 associated with obesity.",
            "It has been demonstrated that a high intake of 主题 results in damage to … (作者, 时间; …).",
            "There is a large number of published studies (e.g., 作者, 时间) that describe …",
            "Some cross-sectional studies suggest an association between 主题 and 同义词 (作者, 时间).",
            "It has been suggested that levels of 主题 are independent of the size of the 同义词 (作者 et al., 时间).",
            "It has conclusively been shown that 主题 and 同义词 increase 近义词 (作者 et al., 时间)."
        )
    )
    现相关 = Some(
        listOf(
            "主题, 同义词 and 近义词 appear to be closely linked (作者, 时间).",
            "主题 appears to be positively related to both 同义词 and 近义词 (作者, 时间)",
            "主题 is a principal determining factor of 同义词 (作者, 时间; 作者, 时间).",
            "主题 is one of the most intense reactions following CHD (作者, 时间).",
            "There is an unambiguous relationship between 主题 and 同义词 (作者, 时间).",
            "主题 is significantly reduced during the first months of … (作者, 时间; 作者, 时间).",
            "主题 has been found to oppose the anti-inflammatory actions of 同义词 on 近义词 (作者, 时间).",
            "GM varieties of maize are able to cross-pollinate with non-GM varieties (作者, 时间) …",
            "A relationship exists between an individual’s working memory and their ability to … (作者, 时间)."
        )
    )
    前做法 = Some(
        listOf(
            "Most research on 主题 has been carried out in …",
            "Most researchers investigating 主题 have utilised …",
            "Using this approach, researchers have been able to …",
            "Several systematic reviews of 主题 have been undertaken.",
            "The vast majority of studies on 主题 have been quantitative.",
            "What we know about 主题 is largely based on observational studies.",
            "There are a number of large cross-sectional studies which suggest …",
            "Much of the previous research on 主题 has been exploratory in nature.",
            "Much of the 主题 research has focused on identifying and evaluating the …",
            "What we know about 主题 is largely based upon empirical studies that investigate how …",
            "Publications that concentrate on 主题 more frequently adopt a historical or chronological approach …"
        )
    )
    前人员 = Some(
        listOf(
            "作者 compared the rate of 主题 …",
            "作者 labelled these subsets as …",
            "作者 measured both components of the 主题 and 同义词 …",
            "作者 used a survey to assess the various …",
            "作者 identified that 主题 as …",
            "作者 set up a series of virtual experiments using …",
            "作者 examined the flow of international students …",
            "作者 carried out a number of investigations into the …",
            "作者 studied the effects of 主题 on unprotected nerve cells.",
            "作者 analysed the data from 72 countries and concluded that …",
            "作者 interviewed 250 undergraduate students using semi-structured …",
            "作者 performed a similar series of experiments in 时间 to show that …",
            "作者 reviewed the literature from the period and found little evidence for this …",
            "作者 conducted a series of trials in which he mixed 主题 with different quantities of …",
            "作者 investigated the differential impact of formal and non-formal education on …"
        )
    )
    前时间 = Some(
        listOf(
            "In 时间, a seminal article was published entitled …",
            "In 时间, Brown performed a bilateral ablation of the …",
            "In 时间, the publication of 主题 had a major impact on …",
            "In 时间, 作者 published his major historic survey of …",
            "In 时间, 作者 et al. published a paper in which they described …",
            "In 时间, 作者 et al. made several amino acid esters of 主题 and evaluated them as …",
            "In 时间, 作者 and co-workers demonstrated that 主题 induced in vitro resistance to …",
            "In 时间, 作者 et al. demonstrated that replacement of H2O with heavy water led to …",
            "In 时间, 作者 et al. reported a new and convenient synthetic procedure to obtain …",
            "Thirty years later, 作者 (时间) reported three cases of 主题 which …",
            "In the 时间, 作者 pointed to some of the ways in which …",
            "Following World War 1, 作者 actively searched for 主题.",
            "Almost 20 years ago, 作者 (时间) formulated his 主题 theory, centred around …"
        )
    )
    前研究 = Some(
        listOf(
            "One longitudinal study found that 主题 …",
            "A seminal study in this area is the work of 主题 …",
            "One study by 作者 (时间) examined the trend in 主题 …",
            "A recent study by 作者 and 作者 (时间) involved 主题 …",
            "A qualitative study by 作者 (时间) described how 主题 …",
            "A recent systematic literature review concluded that 主题 …",
            "Preliminary work on 主题 was undertaken by 作者 (时间).",
            "A longitudinal study of 主题 by 作者 (时间) reports that …",
            "A key study comparing 主题 and 同义词 is that of 作者 (时间), in which …",
            "The first systematic study of 主题 was reported by 作者 et al. in 时间.",
            "Detailed examination of 主题 by 作者 and 作者 (时间) showed that …",
            "Analysis of the genes involved in 主题 was first carried out by 作者 et al. (时间).",
            "A significant analysis and discussion on the subject was presented by 作者 (时间).",
            "The study of the structural behaviour of 主题 was first carried out by 作者 et al. (时间).",
            "A small scale study by 作者 (时间) reached different conclusions, finding no increase in …",
            "The study by 作者 (时间) offers probably the most comprehensive empirical analysis of …",
            "In an analysis of 主题, 作者 et al. (时间) found …",
            "In a follow-up study, 作者 et al. (时间) found that …",
            "In an investigation into 主题, 作者 et al. (时间) found …",
            "In a study investigating 主题, 作者 (时间) reported that …",
            "In a comprehensive study of 主题, 作者 (时间) found that …",
            "In a study conducted by 作者 (时间), it was shown that …",
            "In studies of rats given 主题, 作者 and colleagues found that …",
            "In a study which set out to determine 主题, 作者 (时间) found that …",
            "In a randomised controlled study of 主题, 作者 (时间) reported that …",
            "In another major study, 作者 (时间) found that just over half of the …",
            "In a recent cross-sectional study, 作者 (时间) investigated whether …",
            "In a large longitudinal study, 作者 et al. (时间) investigated the incidence of 主题 in 同义词.",
            "In one well-known recent experiment, limits on 主题 were found to be … (作者, 时间)"
        )
    )
    前话题 = Some(
        listOf(
            "To determine the effects of 主题, 作者 et al. (时间) compared …",
            "主题 was originally isolated from 同义词 in a soil sample from … (作者 et al., 时间).",
            "The electronic spectroscopy of 主题 was first studied by 作者 and 作者 in 时间.",
            "主题 formed the central focus of a study by 作者 (时间) in which the author found …",
            "To better understand the mechanisms of 主题 and its effects, 作者 (时间) analysed the …",
            "主题 was first demonstrated experimentally by 作者 (作者, 时间). In his seminal study …",
            "The 上级 relationship reaction between 主题 and 同义词 was first reported by 作者 in 时间.",
            "The way in which 主题 is regulated was studied extensively by 作者 and colleagues (作者 et al. 时间 and 时间)."
        )
    )
    前关系 = Some(
        listOf(
            "In this chapter, 作者 provides us with a number of important …",
            "In the subsequent chapter, 作者 examines the extent to which …",
            "By drawing on the concept of 主题, 作者 has been able to show that …",
            "Some analysts (e.g. 作者, 时间) have attempted to draw fine distinctions between …",
            "Drawing on an extensive range of sources, the authors set out the different ways in which …",
            "Other authors (see 作者, 时间) question the usefulness of such an approach."
        )
    )
    前总结 = Some(
        listOf(
            "Similarly, 作者 (时间) found that 主题 …",
            "In the same vein, 作者 (时间) in his book 主题, 同义词 and 近义词 notes …",
            "This view is supported by 作者 (时间) who writes that …",
            "作者 argues that her data support 作者’s (时间) view that …",
            "作者’s (时间) work on 主题 is complemented by 作者’s (时间) study of …",
            "Almost every paper that has been written on 主题 includes a section relating to …",
            "Unlike 作者, 作者 (时间) argues that …",
            "In contrast to 作者, 作者 (时间) argues that …",
            "A broader perspective has been adopted by 作者 (时间) who argues that …",
            "Conversely, 作者 (时间) reported no significant difference in mortality between 主题 and 同义词."
        )
    )

//方法的部分
    前方法 = Some(
        listOf(
            "Many researchers have utilised 方法 to measure …",
            "One of the most well-known tools for assessing …",
            "Traditionally, 方法 has been assessed by measuring …",
            "A number of techniques have been developed to …",
            "Different methods have been proposed to classify …",
            "方法 is the main non-invasive method used to determine …",
            "Different authors have measured 方法 in a variety of ways.",
            "Several methods currently exist for the measurement of 方法.",
            "Previous studies have based their criteria for selection on …",
            "方法 is one of the most common procedures for determining …",
            "There are three main types of study design used to identify …",
            "The use of life story data has a relatively long tradition within 方法.",
            "Recent advances in 方法 methods have facilitated investigation of …",
            "There are a number of instruments available for measuring the …",
            "方法 and 同义词 are currently the most popular methods for investigating …",
            "Recently, simpler and more rapid tests of 方法 have been developed.",
            "In most recent studies, 方法 has been measured in four different ways.",
            "The use of qualitative case studies is a well-established approach in …",
            "方法s have been used in the past to investigate the mechanical properties of …"
        )
    )
    近方法 = Some(
        listOf(
            "A major advantage of 方法 is that …",
            "The benefit of this approach is that …",
            "方法 based methods provide a means of …",
            "方法 was selected for its reliability and validity.",
            "A case study approach was used to allow a …",
            "This method is particularly useful in studying …",
            "A quantitative approach was employed since …",
            "Qualitative methods offer an effective way of …",
            "The design of the researchs was based on …",
            "The 方法 method is one of the more practical ways of …",
            "The semi-structured approach was chosen because …",
            "The 方法 approach has a number of attractive features: …",
            "The advantages of 方法s are that they are simple to deliver.",
            "The second advantage of using the multivariate method is …",
            "The study uses qualitative analysis in order to gain insights into …",
            "One advantage of the 方法 analysis is that it avoids the problem of …",
            "Another advantage of using computer simulations is that it allows …",
            "Continuous sampling methods have a number of advantages over …",
            "The collaborative nature of the focus group offers another advantage …",
            "Qualitative methods can be more useful for identifying and characterising …",
            "A major problem with the experimental method is that …",
            "The main disadvantage of the experimental method is that …",
            "However, there are certain drawbacks associated with the use of …",
            "There are certain problems with the use of focus groups. One of these is that there is less …"
        )
    )
    源方法 = Some(
        listOf(
            "The solution was then assayed for 主题 using the 方法 method.",
            "方法 was prepared according to the procedure used by 作者. (时间).",
            "The analysis of 主题 was done by 方法 according to the procedure of 作者 (时间).",
            "主题 was tested with the same method that was detailed for 同义词, using 方法 …",
            "Samples were analysed for 主题 as previously reported by 作者 et al. (时间).",
            "Analysis was based on the 方法 proposed by 作者 et al. (时间).",
            "This 主题 was prepared by the procedure of 方法 used by 作者 et al. (时间) …"
        )
    )
    样本征 = Some(
        listOf(
            "The cohort was divided into two groups according to …",
            "A random sample of patients with … was recruited from …",
            "Articles were searched from January 时间 until April 时间.",
            "The sample was representative with respect to gender and …",
            "Forty-seven students studying 主题 were recruited for this study.",
            "A systematic literature review was conducted of studies that …",
            "Just over half the sample (53%) was female, of whom 69% were …",
            "Of the initial cohort of 123 students, 66 were female and 57 male.",
            "Eligible women who matched the selection criteria were identified by …",
            "Only children aged between 10 and 15 years were included in the study.",
            "The participants were divided into two groups based on their performance on …",
            "Two groups of subjects were interviewed, namely 主题 and 同义词. The first group were …",
            "The project used a convenience sample of 32 first year modern languages students.",
            "All of the participants were aged between 18 and 19 at the beginning of the study …",
            "All studies described as using some sort of 主题 procedure were included in the analysis.",
            "Participants were recruited from 15 clinics across …, covering urban and rural areas …",
            "The initial sample consisted of 200 students, 75 of whom belonged to minority groups."
        )
    )
    样本基 = Some(
        listOf(
            "Criteria for selecting the subjects were as follows:",
            "Publications were only included in the analysis if …",
            "The participants in this study were recruited from …",
            "To identify 主题, the following parameters were used: …",
            "The area of study was chosen for its relatively small …",
            "Primary inclusion criteria for the 主题 participants were …",
            "Eligibility criteria required individuals to have received …",
            "Five individuals were excluded from the study on the basis of …",
            "A small sample was chosen because of the expected difficulty in obtaining …",
            "The subjects were selected on the basis of the degree of homogeneity of their …",
            "A comparison group of 12 male subjects without any history of 主题 was drawn from a pool of …"
        )
    )
    方法意 = Some(
        listOf(
            "In order to identify 主题 …, the participants were asked to …",
            "In order to understand how 主题 regulates 同义词, a series of transfections was performed.",
            "To establish whether …,",
            "To measure 主题, a question asking … was used.",
            "To determine whether …, the 特征 were incubated for …",
            "To rule out the possibility that 主题, the participants were …",
            "To control for bias, measurements were carried out by another person.",
            "To assess whether and how 主题s are produced and received, we measured …",
            "To see if the two methods gave the same measurement, the data was plotted and …",
            "To enable the subjects to see the computer screen clearly, the laptop was configured with …",
            "To increase the reliability of measures, each 主题 was tested twice with a 4-minute break between …",
            "To compare the scores three weeks after initial screening, a global ANOVA F-test was used",
            "The vials were capped with … to prevent …",
            "The process was repeated several times in order to remove …",
            "In an attempt to make each interviewee feel as comfortable as possible, the interviewer …"
        )
    )
    总步骤 = Some(
        listOf(
            "For the 特征 questions, a Likert scale was used.",
            "For the purpose of 特征 measurement, subjects were asked to stand …",
            "For the purpose of analysis 特征 of 主题, two segments were extracted from each …",
            "For the estimation of 特征, 主题 sample was mixed with …"
        )
    )
    被步骤 = Some(
        listOf(
            "All participants were sent …",
            "The data were normalised using …",
            "Ethical approval was obtained from …",
            "Drugs were administered by icv injection …",
            "Descriptive data were generated for all variables.",
            "The procedures of this study were approved by …",
            "Prompts were used as an aid to question two so that …",
            "Data were collected using semi-structured interviews in …",
            "Participants were thanked for their time and effort and for …",
            "The experiments were run using custom software written in …",
            "Two sets of anonymised researchs were completed by …",
            "A total of 256 samples were taken from 52 boreholes (Figure 11).",
            "The solution was washed three times with deionized water and …",
            "Significance levels were set at the 1% level using the student t-test.",
            "Data management and analysis were performed using SPSS 16.0 (2010).",
            "Published studies were identified using a search strategy developed in …",
            "Data were gathered from multiple sources at various time points during …",
            "Injection solutions were coded by a colleague to reduce experimenter bias.",
            "The pilot interviews were conducted informally by the trained interviewer …",
            "Article references were searched further for additional relevant publications …"
        )
    )
    步骤前 = Some(
        listOf(
            "To begin this process, …",
            "The first step in this process was to …",
            "The second method used to identify 主题 involved …",
            "The subjects were then shown a film individually and were asked to …",
            "The 主题 was then tested again, and this weight was recorded as …",
            "The results were corrected for the background readings and then averaged before …",
            "These ratings were then made for the ten stimuli to which the subject had been exposed …",
            "The analysis was checked when initially performed and then checked again at the end of …",
            "Finally, questions were asked as to the role of …",
            "In the follow-up phase of the study, participants were asked …",
            "The final stage of the study comprised a semi-structured interview with participants who …"
        )
    )
    步骤度 = Some(
        listOf(
            "The 特征 was then aseptically transferred to a conical flask.",
            "A sample of the concentrate was then carefully injected into …",
            "The tubes were accurately reweighed to six decimal places using …",
            "The 特征 was then placed in a 上级 tool and gradually test to …",
            "The 特征 were taken manually to allow the soil to mix well with the water.",
            "The resulting solution was gently mixed at room temperature for ten minutes and …"
        )
    )
    分析器 = Some(
        listOf(
            "Data were collected using two 方法s of 主题s.",
            "Semi-automated 方法 was carried out using 主题 software and …",
            "Using the 方法 and looking at the actual 特征, it was possible to identify that 主题 …",
            "Comparisons between the two groups of 主题 were made using unrelated t-tests.",
            "The data were recorded on 方法 recorder and transcribed using a 特征 analyser …",
            "Statistical significance was analysed using analysis of variance and t-tests as appropriate.",
            "Using an 方法, we were able to separate single 特征 into different …",
            "15 subjects of 上级 were recruited using 方法 requesting 主题 and 同义词 from …",
            "All the 方法 on the computer was carried out using Quattro Pro for Windows and …"
        )
    )
    方法缺 = Some(
        listOf(
            "In particular, the analysis of 主题 was problematic.",
            "In observational studies, there is a potential for 特征 bias from …",
            "The small size of the dataset meant that it was not possible to …",
            "Further data collection is required to determine exactly how 主题 affects 同义词.",
            "Another major source of uncertainty is in the method used to calculate 主题.",
            "In this investigation there are several sources for error. The main error is …",
            "It was not possible to investigate the significant relationships of 主题 and 同义词 further because …",
            "The responses relating to 主题 were subjective and were therefore susceptible to recall bias."
        )
    )

//讨论的部分
    重总证 = Some(
        listOf(
            "Several reports have shown that …",
            "As mentioned in the literature review, …",
            "Prior studies that have noted the importance of …",
            "Very little was found in the literature on the question of …",
            "Previous studies evaluating 主题 observed inconsistent results on whether …",
            "A strong relationship between 主题 and 同义词 has been reported in the literature.",
            "In reviewing the literature, no data was found on the association between 主题 and 同义词."
        )
    )
    重目的 = Some(
        listOf(
            "The third question in this research was …",
            "An initial objective of the project was to identify …",
            "The first question in this study sought to determine …",
            "It was hypothesised that participants with a history of …",
            "The present study was designed to determine the effect of …",
            "With respect to the first research question, it was found that …",
            "This study set out with the aim of assessing the importance of 主题 in …"
        )
    )
    重结果 = Some(
        listOf(
            "One interesting finding is …",
            "The current study found that …",
            "Another important finding was that …",
            "The most interesting finding was that …",
            "In this study, 主题s were found to cause …",
            "The results of this study show/indicate that …",
            "On the question of 主题, this study found that …",
            "This experiment did not detect any evidence for …",
            "The most important clinically relevant finding was …",
            "主题 provided the largest set of significant clusters of …",
            "It is interesting to note that in all seven cases of this study …",
            "The most obvious finding to emerge from the analysis is that …",
            "In the current study, comparing 主题 with 同义词 showed that the mean degree of …",
            "The results of this study did not show that …/did not show any significant increase in …"
        )
    )
    外结果 = Some(
        listOf(
            "Surprisingly, 主题 was found to ….",
            "What is surprising is that ….",
            "One unanticipated finding was that ….",
            "Surprisingly, no differences were found in ….",
            "This finding was unexpected and suggests that ….",
            "It is somewhat surprising that no 主题 was noted in this condition ….",
            "Contrary to expectations, this study did not find a significant difference between ….",
            "However, the observed difference between 主题 and 同义词 in this study was not significant.",
            "However, the ANOVA (one way) showed that these results were not statistically significant."
        )
    )
    重分证 = Some(
        listOf(
            "This study confirms that 主题 is associated with …",
            "This finding was also reported by 作者 et al. (时间).",
            "This finding is consistent with that of 作者 (时间) who …",
            "Comparison of the findings with those of other studies confirms …",
            "This also accords with our earlier observations, which showed that …",
            "These results reflect those of 作者 et al. (时间) who also found that …",
            "Increased activation in the 主题 in this study corroborates these earlier findings.",
            "These results corroborate the findings of a great deal of the previous work in …",
            "This finding broadly supports the work of other studies in this area linking 主题 with 同义词.",
            "In accordance with the present results, previous studies have demonstrated that …",
            "It is encouraging to compare this figure with that found by 作者 (时间) who found that …",
            "Consistent with the literature, this research found that participants who reported using 主题 also …",
            "This study supports evidence from previous observations (e.g. 作者 et al., 时间).",
            "There are similarities between the attitudes expressed by 主题 in this study and those described by …"
        )
    )
    重反证 = Some(
        listOf(
            "This study has been unable to demonstrate that …",
            "However, this result has not previously been described.",
            "This outcome is contrary to that of 作者 et al. (时间) who found …",
            "This finding is contrary to previous studies which have suggested that …",
            "In contrast to earlier findings, however, no evidence of 主题 was detected.",
            "The yields in this investigation were higher compared to those of other studies.",
            "However, the findings of the current study do not support the previous research.",
            "作者 et al. (时间) showed that … This differs from the findings presented here …",
            "The overall level was found to be 15%, lower than that of previously reported levels.",
            "It has been suggested that … (作者 et al., 时间). This does not appear to be the case.",
            "The levels observed in this investigation are far below those observed by 作者 et al. (时间).",
            "These results differ from 主题’s 时间 estimate of 同义词, but they are broadly consistent with earlier …"
        )
    )
    解释 = Some(
        listOf(
            "A possible explanation for this might be that …",
            "Another possible explanation for this is that …",
            "This result may be explained by the fact that …",
            "There are, however, other possible explanations.",
            "These relationships may partly be explained by …",
            "There are several possible explanations for this result.",
            "A possible explanation for these results may be the lack of adequate …",
            "These differences can be explained in part by the proximity of 主题 and 同义词.",
            "These factors may explain the relatively good correlation between 主题 and 同义词.",
            "This inconsistency may be due to …",
            "These results are likely to be related to …",
            "This discrepancy could be attributed to …",
            "It seems possible that these results are due to …",
            "This rather contradictory result may be due to …",
            "The observed increase in 主题 could be attributed to …",
            "It is difficult to explain this result, but it might be related to …",
            "The possible interference of 主题 cannot be ruled out.",
            "It may be that these participants benefitted from …",
            "Differences between 主题 and 同义词 may have influenced …",
            "These possible sources of error could have affected …",
            "There are two likely causes for the differences between …",
            "The reason for this is not clear but it may have something to do with …",
            "The observed correlation between 主题 and 同义词 might be explained in this way: …",
            "Since this difference has not been found elsewhere it is probably not due to …"
        )
    )
    谨慎 = Some(
        listOf(
            "Another source of uncertainty is …",
            "A note of caution is due here since …",
            "These findings may be somewhat limited by …",
            "These findings cannot be extrapolated to all patients.",
            "These data must be interpreted with caution because …",
            "It could be argued that the positive results were due to …",
            "These results therefore need to be interpreted with caution.",
            "In observational studies, there is a potential for bias from …",
            "It is important to bear in mind the possible bias in these responses.",
            "Although exclusion of 主题 did not …, these results should be interpreted with caution.",
            "However, with a small sample size, caution must be applied, as the findings might not be …"
        )
    )
    假设 = Some(
        listOf(
            "It is possible, therefore, that …",
            "It can thus be suggested that …",
            "In general, therefore, it seems that …",
            "It may be the case therefore that these variations …",
            "It is therefore likely that such connections exist between …",
            "It is possible to hypothesise that these conditions are less likely to occur in …",
            "These findings suggest that …",
            "According to these data, we can infer that …",
            "This observation may support the hypothesis that …",
            "Hence, it could conceivably be hypothesised that …",
            "The value of 主题 suggests that a weak link may exist between …",
            "These results provide further support for the hypothesis that …",
            "Therefore, 主题 could be a major factor, if not the only one, causing …",
            "Noting implications of the findings",
            "It can therefore be assumed that the …",
            "An implication of this is the possibility that …",
            "The present study raises the possibility that …",
            "One of the issues that emerges from these findings is …",
            "Some of the issues emerging from this finding relate specifically to …",
            "These findings may help us to understand …",
            "This finding, while preliminary, suggests that .…",
            "This finding has important implications for developing …",
            "This observational study suggests that a diet rich in 主题 may help prevent …",
            "These findings raise intriguing questions regarding the nature and extent of …",
            "This combination of findings provides some support for the conceptual premise that …"
        )
    )
    评论 = Some(
        listOf(
            "These findings are rather disappointing.",
            "However, these results were not very encouraging.",
            "The test was successful as it was able to identify students who …",
            "The present results are significant in at least two major respects.",
            "The results of this study do not explain the occurrence of these adverse events.",
            "These findings will doubtless be much scrutinised, but there are some immediately dependable conclusions for …"
        )
    )
    重建议 = Some(
        listOf(
            "This is an important issue for future research.",
            "Research questions that could be asked include …",
            "There are still many unanswered questions about …",
            "Several questions remain unanswered at present.",
            "Despite these promising results, questions remain.",
            "Further work is required to establish the viability of…",
            "Further research should be undertaken to investigate the …",
            "There is abundant room for further progress in determining …",
            "A further study with more focus on 主题 is therefore suggested.",
            "Future studies on the current topic are therefore recommended.",
            "To develop a full picture of 主题, additional studies will be needed that …",
            "In future investigations, it might be possible to use a different 主题 in which …",
            "Further studies, which take these variables into account, will need to be undertaken."
        )
    )

//结论的部分
    总声明 = Some(
        listOf(
            "This study set out to …",
            "This paper has argued that …",
            "This essay has discussed the reasons for …",
            "In this investigation, the aim was to assess …",
            "The aim of the present research was to examine …",
            "The purpose of the current study was to determine …",
            "The main goal of the current study was to determine …",
            "This project was undertaken to design … and evaluate …",
            "The present study was designed to determine the effect of …",
            "The second aim of this study was to investigate the effects of …"
        )
    )
    总发现 = Some(
        listOf(
            "This study has identified …",
            "This study has shown that …",
            "The research has also shown that …",
            "The second major finding was that …",
            "These experiments confirmed that …",
            "主题 made no significant difference to …",
            "This study has found that generally …",
            "The investigation of 主题 has shown that …",
            "The results of this investigation show that …",
            "主题, 同义词 and 近义词 emerged as reliable predictors of …",
            "Multiple regression analysis revealed that the …",
            "The most obvious finding to emerge from this study is that …",
            "The relevance of 主题 is clearly supported by the current findings.",
            "One of the more significant findings to emerge from this study is that …"
        )
    )
    域发现 = Some(
        listOf(
            "In general, therefore, it seems that …",
            "The results of this study indicate that …",
            "These findings suggest that in general …",
            "The findings of this study suggest that …",
            "Taken together, these results suggest that …",
            "An implication of this is the possibility that …",
            "The evidence from this study suggests that …",
            "Overall, this study strengthens the idea that …",
            "The current data highlight the importance of …",
            "The findings of this research provide insights for …",
            "The results of this research support the idea that …",
            "These data suggest that 主题 can be achieved through …",
            "The theoretical implications of these findings are unclear.",
            "The principal theoretical implication of this study is that …",
            "This study has raised important questions about the nature of …",
            "The following conclusions can be drawn from the present study …",
            "Taken together, these findings suggest a role for 主题 in promoting 同义词.",
            "The findings of this investigation complement those of earlier studies.",
            "These findings have significant implications for the understanding of how …",
            "Although this study focuses on 主题, the findings may well have a bearing on …, "
        )
    )
    总意义 = Some(
        listOf(
            "The findings will be of interest to …",
            "This thesis has provided a deeper insight into …",
            "The findings reported here shed new light on …",
            "The study contributes to our understanding of …",
            "These results add to the rapidly expanding field of …",
            "The contribution of this study has been to confirm …",
            "Before this study, evidence of 主题 was purely anecdotal.",
            "This project is the first comprehensive investigation of …",
            "The insights gained from this study may be of assistance to …",
            "This work contributes to existing knowledge of 主题 by providing …",
            "This is the largest study so far documenting a delayed onset of …",
            "Prior to this study it was difficult to make predictions about how …",
            "The analysis of 主题 undertaken here, has extended our knowledge of …",
            "The empirical findings in this study provide a new understanding of …",
            "This paper contributes to recent historiographical debates concerning …",
            "This approach will prove useful in expanding our understanding of how …",
            "This new understanding should help to improve predictions of the impact of …",
            "This is the first report on 主题 from a nationally representative cohort of patients.",
            "The methods used for this 主题 may be applied to other 主题s elsewhere in the world.",
            "The 主题 that we have identified therefore assists in our understanding of the role of …",
            "This is the first study of substantial duration which examines associations between …",
            "The findings from this study make several contributions to the current literature. First,…",
            "These findings contribute in several ways to our understanding of 主题 and provide a basis for …",
            "Recognising the limitations of the current study",
            "A limitation of this study is that …",
            "Being limited to 主题, this study lacks …",
            "The small sample size did not allow …",
            "The major limitation of this study is the …",
            "This study was limited by the absence of …",
            "主题 makes these findings less generalisable to …",
            "Thirdly, the study did not evaluate the use of …",
            "It is unfortunate that the study did not include …",
            "The scope of this study was limited in terms of …",
            "The study is limited by the lack of information on …",
            "The most important limitation lies in the fact that …",
            "The main weakness of this study was the paucity of …",
            "Since the study was limited to 主题, it was not possible to ..",
            "An additional uncontrolled factor is the possibility that …",
            "It was not possible to assess 主题; therefore, it is unknown if …",
            "An issue that was not addressed in this study was whether…",
            "The generalisability of these results is subject to certain limitations. For instance, …",
            "One source of weakness in this study which could have affected the measurements of 主题 was …"
        )
    )
    总缺陷 = Some(
        listOf(
            "Notwithstanding these limitations, the study suggests that …",
            "Whilst this study did not confirm 主题, it did partially substantiate …",
            "Despite its exploratory nature, this study offers some insight into …",
            "In spite of its limitations, the study certainly adds to our understanding of the …",
            "Notwithstanding the relatively limited sample, this work offers valuable insights into …",
            "Although the current study is based on a small sample of participants, the findings suggest …"
        )
    )
    未工作 = Some(
        listOf(
            "The question raised by this study is …",
            "The study should be repeated using …",
            "This would be a fruitful area for further work.",
            "Several questions still remain to be answered.",
            "A natural progression of this work is to analyse …",
            "More research using controlled trials is needed to …",
            "More broadly, research is also needed to determine …",
            "A further study could assess the long-term effects of …",
            "What is now needed is a cross-national study involving …",
            "Considerably more work will need to be done to determine …",
            "The precise mechanism of 主题 in insects remains to be elucidated.",
            "These findings provide the following insights for future research: …",
            "Large randomised controlled trials could provide more definitive evidence.",
            "This research has thrown up many questions in need of further investigation.",
            "A greater focus on 主题 could produce interesting findings that account more for …",
            "The issue of 主题 is an intriguing one which could be usefully explored in further research.",
            "If the debate is to be moved forward, a better understanding of 主题 needs to be developed.",
            "I suggest that before 主题 is introduced, a study similar to this one should be carried out on …",
            "More information on 主题 would help us to establish a greater degree of accuracy on this matter.",
            "Setting out recommendations for practice or policy",
            "Other types of 主题 could include: a), b). …",
            "There is, therefore, a definite need for …",
            "Greater efforts are needed to ensure …",
            "Provision of 主题 will enhance 同义词 and reduce 近义词.",
            "Another important practical implication is that …",
            "Moreover, more 主题 should be made available to …",
            "The challenge now is to fabricate 主题s that contain …",
            "Unless governments adopt 主题, 同义词 will not be attained.",
            "These findings suggest several courses of action for …",
            "A reasonable approach to tackle this issue could be to …",
            "Continued efforts are needed to make 主题 more accessible to …",
            "The findings of this study have a number of practical implications.",
            "There are a number of important changes which need to be made.",
            "Management to enhance bumble-bee populations might involve …",
            "This study suggests that 主题 should be avoided by people who are prone to …",
            "A key policy priority should therefore be to plan for the long-term care of …",
            "This information can be used to develop targetted interventions aimed at …",
            "Taken together, these findings do not support strong recommendations to …",
            "Ensuring appropriate systems, services and support for 主题 should be a priority for …",
            "The findings of this study have a number of important implications for future practice."
        )
    )
//其他
    作者 = Some(
        listOf(
            "Zhao",
            "Qian",
            "Sun",
            "Li",
            "Zhou",
            "Wu",
            "Zheng",
            "Wang",
            "Feng",
            "Chen",
            "Chu",
            "Wei",
            "Jiang",
            "Shen",
            "Han",
            "Yang",
            "Zhu",
            "Qin",
            "You",
            "Xu",
            "He",
            "Lu",
            "Shi",
            "Zhang",
            "Kong",
            "Cao",
            "Yan",
            "Hua",
            "Jin",
            "Wei",
            "Tao",
            "Jiang"
        )
    )
    时间 = Some(
        listOf(
            "1989",
            "1990",
            "1991",
            "1992",
            "1993",
            "1994",
            "1995",
            "1996",
            "1997",
            "1998",
            "1999",
            "2000",
            "2001",
            "2002",
            "2003",
            "2004",
            "2005",
            "2006",
            "2007",
            "2008",
            "2009",
            "2010",
            "2011",
            "2012",
            "2013",
            "2014",
            "2015",
            "2016",
            "2017",
            "2018",
            "2019",
            "2020"
        )
    )
    从句库 = Some(
        listOf(
            "从句 0",
            "从句 1",
            "从句 2",
            "从句 3",
            "从句 4",
            "从句 5",
            "从句 6",
            "从句 7",
            "从句 8",
            "从句 9",
            "从句 10",
            "从句 11",
            "从句 12",
            "从句 13",
            "从句 14",
            "从句 15",
            "从句 16",
            "从句 17",
            "从句 18",
            "从句 19",
            "从句 19",
            "从句 20",
            "从句 21",
            "从句 22",
            "从句 23",
            "从句 24",
            "从句 25",
            "从句 26",
            "从句 27",
            "从句 28",
            "从句 29",
            "从句 30",
            "从句 31",
            "从句 32",
            "从句 33",
            "从句 34",
            "从句 35",
            "从句 36",
            "从句 37",
            "从句 38",
            "从句 39",
            "从句 40"
        )
    )
//句库名称
    结果部分 = Some(
        listOf(
            结目的,
            结数据,
            正数据,
            负数据,
            两数据,
            亮数据,
            效数据,
            比数据,
            场数据,
            另数据,
            外数据,
            结过渡,
            Some(listOf(分段)),
            结目的,
            结数据,
            正数据,
            负数据,
            两数据,
            亮数据,
            效数据,
            比数据,
            场数据,
            另数据,
            外数据,
            结过渡,
            Some(listOf(分段)),
            结目的,
            结数据,
            正数据,
            负数据,
            两数据,
            亮数据,
            效数据,
            比数据,
            场数据,
            另数据,
            外数据,
            结过渡,
            结论点
        )
    )
    证言部分 = Some(
        listOf(
            泛相关,
            前人员,
            前时间,
            前研究,
            前话题,
            前关系,
            Some(listOf(分段)),
            远相关,
            前人员,
            前时间,
            前研究,
            前话题,
            前关系,
            Some(listOf(分段)),
            域相关,
            前人员,
            前时间,
            前研究,
            前话题,
            前关系,
            Some(listOf(分段)),
            近相关,
            前人员,
            前时间,
            前研究,
            前话题,
            前关系,
            Some(listOf(分段)),
            现相关,
            前做法,
            前人员,
            前时间,
            前研究,
            前话题,
            前关系,
            前总结
        )
    )
    方法部分 = Some(
        listOf(
            前方法,
            近方法,
            源方法,
            样本征,
            样本基,
            方法意,
            总步骤,
            被步骤,
            步骤前,
            步骤度,
            Some(listOf(分段)),
            方法意,
            总步骤,
            被步骤,
            步骤前,
            步骤度,
            Some(listOf(分段)),
            方法意,
            总步骤,
            被步骤,
            步骤前,
            步骤度,
            Some(listOf(分段)),
            分析器,
            方法缺
        )
    )
    讨论部分 = Some(
        listOf(
            重总证,
            重目的,
            重结果,
            解释,
            谨慎,
            假设,
            评论,
            Some(listOf(分段)),
            外结果,
            解释,
            谨慎,
            假设,
            评论,
            Some(listOf(分段)),
            重分证,
            解释,
            谨慎,
            假设,
            评论,
            Some(listOf(分段)),
            重反证,
            解释,
            谨慎,
            假设,
            评论,
            重建议
        )
    )
    结论部分 = Some(
        listOf(
            总声明,
            总发现,
            域发现,
            总发现,
            域发现,
            总发现,
            域发现,
            总缺陷,
            未工作,
            总声明
        )
    )
//基本
//全局输入
    主题 = Some("Red")
    同义词 = Some("Blue")
    近义词 = Some("Orange")
    上级 = Some("colour")
    方法 = Some("measuring")
    特征 = Some("wave length")
//局部写入
    选中作者 = Some((作者 as Some<List<String>>).t[序列])
    选中时间 = Some((时间 as Some<List<String>>).t[序列])
    从句 = Some((从句库 as Some<List<String>>).t[局部序列1])
}