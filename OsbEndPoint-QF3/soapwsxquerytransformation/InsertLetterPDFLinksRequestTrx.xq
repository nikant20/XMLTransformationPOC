declare namespace ns0 = "http://services.vida.psi.com/LetterManagement/1.0";
declare namespace xf = "http://tempuri.org/FLHKServices/Resources/transformation/InsertLetterPDFLinksRequestTrx/";
declare namespace ns = "http://webservice.flhk.com/FLHKWebService/1.0";
declare namespace ns2 = "http://webservice.flhk.com/FLHKWebService/1.0";

declare function xf:InsertLetterPDFLinksRequestTrx($insertLetterPDFLinksParam as element())
    as element() {
        let $insertLetterPDFLinks := $insertLetterPDFLinksParam
        return
            <ns2:insertLetterPDFLinks>
                {
                    for $fileName in $insertLetterPDFLinksParam/fileName
                    return
                        <fileName>{ data($fileName) }</fileName>
                }
                {
                    for $filePath in $insertLetterPDFLinksParam/filePath
                    return
                        <filePath>{ data($filePath) }</filePath>
                }
            </ns2:insertLetterPDFLinks>
};

declare variable $labelLinkUri as xs:string external;
let $x := doc($labelLinkUri)/ns:insertLetterPDFLinks
return xf:InsertLetterPDFLinksRequestTrx($x)
