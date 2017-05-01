# ReqUIsite Main Page {#mainpage}

ReqUIsite is a toolset to make the requirements the heart of a SW, 
embedded or any other project. It not only contains the input frontend
to enter the requirements. It also serves as a framework to trace the
requirements, their changes and to include the tests on every level
to proove the requirement has been fulfilled.

## Why I started ReqUIsite?

In all the projects I worked until now, one or more pieces of the project did
not run well or at least very inefficiently. Many of these projects have been
hard at the edge of budget or even ran over budget. This could have been
completely avoided by a good requirements engineering, but even in large
companies, the tooling and it's user friendlyness is at best very low.

DOORS as an example is slow in starting up, not very usable, not easily 
extendable, mostly manual, it's look and feel remebers the time of MSDOS and
the integration into other process related tools is not given at all.

These circumstances lead me to grasp the nettle of creating a framework, that
is useful in a very early stage and can grow to support all the needs of all
the stakeholders of a project, including the engineers needing to implement
the stuff that fulfills the requirements.

For sure, all this will be available as Free and Open Source Software or as
Creative Commons material. This must not necessarily mean, that you can
not take it and earn money with it by extending the capabilities, it just
means, that everybody can take it to make his or her own use of it. If
you receive specifications based on the standard in this project, you
should easily be able to use it by applying the stylesheets and read,
what is in the requirements and how the project is tested against.

More details about the license can be found in the appropriate files named
LICENSE.

Thanks to Kevin Herrera (kherge). I based all my work on his collection of schemas, examples, stylesheets and tools in his GitHub project *srs* (https://github.com/kherge/srs).

Have fun using it!!!

Follwing some more details on the project itself...:


## ReqUIsite structure

The heart of ReqUIsite is the collection of XML schemas and XSLT stylesheets.

### The schema files

The XML schemas can be used bare metal to validate the bare XML documents,
in conjunction with a good XML editor to help creating the documents more
comfortably or to create your own applications around these schemas.

### The stylesheets

The XSLT stylesheets serve different purposes. At first, some of them can 
generate higher level output files like an HTML view of the requirements
in a human readable and nice looking format. With this stylesheets
accompanied with the XML documents, many browsers can direcly show the
contents of the XML documents nicely.

On the other side, used in conjunction with some servlet, they can generate
a web editor making use of REST and the documents as a database for
requirements. Additionally, the documents can then be moved to an object
store or some relational database for higher storage requirements.

## Status of ReqUIsite

ReqUIsite is currently in a very early stage of development. 
