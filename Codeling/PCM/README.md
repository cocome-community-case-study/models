# CoCoME PCM Model
This is a CoCoME PCM model as it is extracted by [Codeling](https://s3gitlab.paluno.uni-due.de/ADVERT/codeling) from a [slightly adapted version](https://s3gitlab.paluno.uni-due.de/ADVERT/case-study_cocome-plain-java) of the [Plain Java CoCoME implementation](https://github.com/cocome-community-case-study/cocome-plain-java).

It is used as the basis for an evolution scenario within the SPP, in which a new payment provider is added with a more abstract interface than `IBank`.

The repository contains the original (pre change) model.
The repository and the system are extracted with Codeling. The other models were manually created to show that a simulation is possible in general. The following models exist:

* **5_il2adl.xmi.repository**: The repository with all declared components. Composite components declare their inner instantiations.
* **5_il2adl.xmi.system**: The system which instantiates the payment providers, one `application`, and one `CashDeskLine`
* **default.resourceenvironment**: A simple example resource environment
* **default.allocation**: A simple allocation model
* **default.usagemodel**: A simple usage model