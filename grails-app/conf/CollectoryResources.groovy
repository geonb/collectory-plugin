modules = {
    'google-maps-api' {
        resource  url: 'https://maps.google.com/maps/api/js?v=3&sensor=true', attrs: [type: "js"], disposition: 'head'
    }
    application {
        resource url:[dir:'js', file:'application.js', plugin:'collectory-plugin']
    }
    smoothness {
        resource url:[dir:'css/smoothness', file:'jquery-ui-1.12.1.min.css', plugin:'collectory-plugin']
    }
    jquery_jsonp {
        resource url:[dir:'js', file:'jquery.jsonp-2.1.4.min.js', plugin:'collectory-plugin']
    }
    jquery_tools {
        resource url:[dir:'js', file:'jquery.tools.min.js', plugin:'collectory-plugin']
    }
    jquery_json {
        resource url:[dir:'js', file:'jquery.json-2.2.min.js', plugin:'collectory-plugin']
    }
    jquery_i18n {
        dependsOn 'jquery_migration'
        resource url:[dir:'js', file:'jquery.i18n.properties-1.0.9.min.js', plugin:'collectory-plugin']
    }
    chart2 {
        dependsOn 'jquery_i18n'
        resource url: [dir:'js',file:'charts2.js']
    }

    fancybox {
        resource url:[dir:'js/jquery.fancybox/fancybox-3.5.7', file:'jquery.fancybox.css', plugin:'collectory-plugin']
        resource url:[dir:'js/jquery.fancybox/fancybox-3.5.7', file:'jquery.fancybox.js', plugin:'collectory-plugin']
    }
    jstree {
        resource url:[dir:'js', file:'jquery.jstree.js', plugin:'collectory-plugin']
        resource url:[dir:'js/themes/classic', file:'style.css', plugin:'collectory-plugin'], attrs:[media:'screen, projection, print']
    }
    jquery_ui_custom {
        resource url:[dir:'js', file:'jquery-ui-1.12.1.min.js', plugin:'collectory-plugin']
    }
    datadumper {
        resource url:[dir:'js', file:'datadumper.js', plugin:'collectory-plugin']
    }
    bbq {
        resource url:[dir:'js', file:'jquery.ba-bbq.min.js', plugin:'collectory-plugin']
    }
    openlayers {
        resource url:[dir:'js', file:'OpenLayers/OpenLayers.js', plugin:'collectory-plugin']
        resource url:[dir:'js', file:'OpenLayers/theme/default/style.css', plugin:'collectory-plugin']
    }
    map {
        resource url:[dir:'js', file:'map.js', plugin:'collectory-plugin']
    }
    datasets {
        dependsOn 'jquery_i18n', 'bbq'
        resource url:[dir:'js', file:'datasets.js', plugin:'collectory-plugin']
    }
    rotate {
        resource url:[dir:'js', file:'jQueryRotateCompressed.2.1.js', plugin:'collectory-plugin']
    }
    bigbuttons {
        resource url:[dir:'css', file:'temp-style.css', plugin:'collectory-plugin']
    }
    debug {
        resource url:[dir:'js', file:'debug.js', plugin:'collectory-plugin']
    }
    change {
        resource url:[dir:'js', file:'change.js', plugin:'collectory-plugin']
    }
    json2 {
        resource url:[dir:'js', file:'json2.js', plugin:'collectory-plugin']
    }
    fileupload {
        dependsOn('bootstrap')
        resource url:[dir:'js', file:'bootstrap-fileupload.min.js', plugin:'collectory-plugin']
        resource url:[dir:'css', file:'bootstrap-fileupload.min.css', plugin:'collectory-plugin']
    }
    taxonTree {
        dependsOn 'jquery_i18n'
        resource url:[dir:'js', file:'taxonTree.js', plugin:'collectory-plugin']
        resource url:[dir:'js/themes/classic', file:'style.css', plugin:'collectory-plugin'], attrs:[media:'screen, projection, print']
    }
    collectory {
        dependsOn 'jquery_ui_custom,smoothness,jquery_i18n,jquery_json,jquery_jsonp,fancybox,openlayers,map'
        resource url:[dir:'js', file:'collectory.js', plugin:'collectory-plugin']
        resource url:[dir:'css', file:'temp-style.css', plugin:'collectory-plugin']
    }
    jquery_migration{
        // Needed to support legacy js components that do not work with latest versions of jQuery
        resource url:[ dir: 'js',file:'jquery-migrate-1.2.1.min.js', plugin:'collectory-plugin']
    }
    datatables {
        // Datatables configured via https://datatables.net/download/ with bootstrap css framework and select plugin
        resource url:[ dir: 'css', file:'datatables.css', plugin:'collectory-plugin']
        resource url:[ dir: 'js', file:'datatables.min.js', plugin:'collectory-plugin']
    }
    charts_plugin {
        resource url:[ dir: 'js', file:'Chart.min.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'bootstrap2-toggle.min.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'bootstrap-slider.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'bootstrap-multiselect.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'moment.min.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'slider.js', plugin:'ala-charts-plugin']
        resource url:[ dir: 'js', file:'ALAChart.js', plugin:'ala-charts-plugin']

        resource url:[ dir: 'css', file:'bootstrap2-toggle.min.css', plugin:'ala-charts-plugin']
        resource url:[ dir: 'css', file:'ALAChart.css', plugin:'ala-charts-plugin']

    }
    public_show {
        resource url:[ dir: 'js', file:'public.show.js', plugin:'collectory-plugin']
    }
}
