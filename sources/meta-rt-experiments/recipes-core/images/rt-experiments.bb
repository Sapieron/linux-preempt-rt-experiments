SUMMARY = "Real-Time Experiments image for PocketBeagle2"

IMAGE_INSTALL = " \
    bitbanger \
    ${CORE_IMAGE_EXTRA_INSTALL} \
"

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"
